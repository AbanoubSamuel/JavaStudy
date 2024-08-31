package org.study.concurrency;

public class ConcurrencyDemo {
    public static void show() {
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime()
//                                  .availableProcessors());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread()
                                     .getName());
            Thread thread1 = new Thread(new DownloadFileTask());
            thread1.start();
        }
    }
}