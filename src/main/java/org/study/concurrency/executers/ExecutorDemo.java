package org.study.concurrency.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void show() {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.submit(() -> System.out.println("Print: " + Thread.currentThread().getName()));
        }
    }
}