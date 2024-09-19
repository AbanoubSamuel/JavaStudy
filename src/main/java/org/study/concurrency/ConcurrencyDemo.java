package org.study.concurrency;

import java.util.*;

public class ConcurrencyDemo {
    public static void show() {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime()
                                  .availableProcessors());
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(tasks
                .stream()
                .map(t -> t.getStatus()
                           .getTotalBytes())
                .reduce(Integer::sum));
    }
}