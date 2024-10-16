package org.study.ultimate.concurrency.executers;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public Stream<CompletableFuture<Quote>> getQuotes() {
        List<String> futures = List.of("site1", "site2", "site3");

        return futures.stream()
                      .map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote....");
            LongTask.simulate();
            Random random = new Random();
            int price = 100 + random.nextInt(10);
            return new Quote(site, price);
        });
    }
}