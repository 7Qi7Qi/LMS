package com.jlu.lmsweb.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class ThreadPool {


    public void start() {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

        //Common Thread Pool
        ExecutorService pool = new ThreadPoolExecutor(5, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 20; i++) {
            pool.execute(()-> System.out.println(Thread.currentThread().getName()));
        }
        pool.shutdown();//gracefully shutdown
    }


    @Test
    public void thread() {
        this.start();
    }
}
