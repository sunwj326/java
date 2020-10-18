package com.mashibing.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: 马士兵教育
 * @create: 2019-10-12 15:41
 */
public class ScheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "------延迟一秒执行，每三秒执行一次");
                    System.out.println(System.currentTimeMillis());
                }
            }, 1, 3, TimeUnit.SECONDS);
        }
//        scheduledExecutorService.shutdown();
    }
}
