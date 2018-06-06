package com.binger.stock.schedule;

import com.binger.common.hystrix.MyScheduleAuthentication;
import com.binger.common.redis.DistributedLockHandler;
import com.binger.common.redis.Lock;
import com.binger.common.schedule.BaseScheduler;
import com.binger.common.util.DateUtils;
import com.binger.stock.service.ProductPlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 上午10:15
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class ProductPlanScheduler extends BaseScheduler {

    private static Logger logger = LoggerFactory.getLogger(ProductPlanScheduler.class);

    @Autowired
    private ProductPlanService productPlanService;

    @PostConstruct
    private void initBean() {
        localTokenServices.setJwtTokenEnhancer(jwtAccessTokenConverter);
    }

//    @Scheduled(cron = "0 25,55 * * * ?")
    @Scheduled(cron = "*/6 * * * * ?")
    public void changeOrderToSendForSchedule() {
        logger.warn("【生产计划】定时任务开始，时间：" + DateUtils.format(new Date()));

        try {
            localTokenServices.loadAuthentication(token);
        } catch (InvalidTokenException e) {
            doLogin();
        } catch (Exception e) {
            logger.error("【生产计划】登录失败", e);
            throw e;
        }
        hystrixCredentialsContext.initializeHystrixRequestContext(new MyScheduleAuthentication(token));
        rewriteBasicUserPrincipal(token);
        logger.warn("【生产计划】登录成功");
        System.out.println("测试中文输出");

        Lock lock = new Lock(applicationName + ":generateProductPlanSchedule:lock", getServerIdentity());
        try {
            if (distributedLockHandler.tryLockFailFast(lock, DistributedLockHandler.ONE_HOUR)) {
                Boolean result = productPlanService.generateProductPlan();
                if(result) {
                    logger.warn("【生产计划】定时任务执行结束，可以查看生产计划");
                } else {
                    logger.warn("【生产计划】定时任务执行失败");
                }
            } else {
                logger.warn("【生产计划】定时任务获取分布式锁失败");
            }
        } catch (Throwable e) {
            logger.error("【生产计划】定时任务报错", e);
            throw e;
        } finally {
            this.tryReleaseLockByServerIdentity(lock);
        }
        logger.warn("【生产计划】定时任务结束，时间：" + DateUtils.format(new Date()));
    }
}
