package org.study.concurrency.executers;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() throws InterruptedException {
        LongTask.simulate();
        System.out.println("Mail was sent successfully");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> {
            try {
                send();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}