package org.study.concurrency.executers;

import org.junit.jupiter.api.Test;
import org.study.ultimate.concurrency.FactorialTask;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class CompletableFutureDemoTest {
    @Test
    void show() {
        //TODO Write show test
    }

    @Test
    void showAsync() {
    }

    @Test
    void printFahrenheit() {
    }

    @Test
    void toFahrenheit() {
    }

    @Test
    void getUserPlaylist() {
    }

    @Test
    void combineTwoAsync() {
    }

    @Test
    void waitManyTasks() {
    }

    @Test
    void waitForFirstTask() {
    }

    @Test
    void handleTimeOuts() {
    }

    @Test
    void quoteService() {
    }

    @Test
    void whenTaskSubmittedThenFutureResultObtained() throws ExecutionException, InterruptedException {
        FactorialTask task = new FactorialTask(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(task);
        System.out.println("Future Object: " + future.get());
        assertEquals(120, future.get().intValue());
    }
}