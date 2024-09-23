package org.study.concurrency.executers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        Supplier<Integer> task = () -> 10;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task);
        try {
            Integer result = future.get();
            System.out.println("Print: " + result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}