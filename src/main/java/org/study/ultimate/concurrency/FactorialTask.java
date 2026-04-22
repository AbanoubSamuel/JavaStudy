package org.study.ultimate.concurrency;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(final int i) {
        number = i;
    }

    // standard constructors

    public Integer call() throws InvalidParameterException {
        int fact = 1;
        // ...
        for (int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}