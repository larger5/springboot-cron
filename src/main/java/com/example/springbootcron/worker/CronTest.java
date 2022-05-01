package com.example.springbootcron.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * cron表达式案例
 *
 * @author hongcunlin
 */
@Component
public class CronTest {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CronTest.class);

    /**
     * 每隔3秒执行1次
     */
    @Scheduled(cron = "*/3 * * * * ?")
    private void test() {
        LOGGER.info("hello");
    }
}
