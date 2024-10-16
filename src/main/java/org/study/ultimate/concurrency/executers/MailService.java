package org.study.ultimate.concurrency.executers;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> {
            try {
                send();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void send() throws InterruptedException {
        LongTask.simulate();
        System.out.println("Mail was sent successfully");
    }
}