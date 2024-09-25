package org.study.concurrency.executers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
//    public static void show() {
//        Supplier<Integer> task = () -> 10;
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task);
//        try {
//            Integer result = future.get();
//            System.out.println("Print: " + result);
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void showAsync() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 1);
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
    }
}