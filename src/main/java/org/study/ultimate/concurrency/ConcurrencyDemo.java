package org.study.ultimate.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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

    public static void syncedCollections() {
        Collection<Integer> collections = Collections.synchronizedCollection(new ArrayList<>());
//        Collection<Integer> collections = new ArrayList<>();

        Thread thread1 = new Thread(() -> collections.addAll(Arrays.asList(1, 2, 3)));

        Thread thread2 = new Thread(() -> collections.addAll(Arrays.asList(4, 5, 6)));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(collections);
    }

    public static void concurrentHashMap() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}