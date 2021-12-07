package com.jlu.lmsweb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class AutoTask implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(String... args) throws Exception {
        ScheduledExecutorService mainPool = Executors.newScheduledThreadPool(1);
        mainPool.scheduleWithFixedDelay(new Task(), 30, 10, TimeUnit.SECONDS);
    }

    class Task implements Runnable {

        @Override
        public void run() {
            logger.info("=========> " + getClass().getName() +  " 状态检测");
        }
    }
}
