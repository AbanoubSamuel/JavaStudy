package org.study.ultimate.concurrency.executers;

import java.util.concurrent.*;
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

    public static void showAsync() {
        CompletableFuture.supplyAsync(() -> 1)
                         .thenRunAsync(() -> {
                             System.out.println(Thread.currentThread().getName());
                             System.out.println("Done");
                         });
    }

    public static void printFahrenheit() {
        CompletableFuture.supplyAsync(() -> 20)
                         .thenApply(CompletableFutureDemo::toFahrenheit)
                         .thenAccept(System.out::println);
    }

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void getUserPlaylist() {
        CompletableFuture.supplyAsync(() -> "Email")
                         .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
                         .thenAccept(System.out::println);
    }

    public static void combineTwoAsync() {
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Double> second = CompletableFuture.supplyAsync(() -> 0.9);

        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
             .thenAccept(System.out::println);
    }

    public static void waitManyTasks() {
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> second = CompletableFuture.supplyAsync(() -> 30);
        CompletableFuture<Integer> third = CompletableFuture.supplyAsync(() -> 40);
        CompletableFuture<Void> all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> System.out.println("All tasks completed"));
    }

    public static void waitForFirstTask() {
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });
        CompletableFuture<Integer> second = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture.anyOf(first, second)
                         .thenAccept(System.out::println);
    }

    public static void handleTimeOuts() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            Integer result = future.completeOnTimeout(1, 1, TimeUnit.SECONDS)
                                   .get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void quoteService() throws InterruptedException {
        FlightService service = new FlightService();
        service.getQuotes()
               .map(future -> future.thenAccept(System.out::println))
               .toList();
        Thread.sleep(10_000);
    }
}