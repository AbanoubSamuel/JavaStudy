package org.study.dsa;

public final class BigO {
    /**
     * @param numbers takes array of numbers
     */
    public static void loop(int[] numbers) {
        // Big O(n^2)
        for (int number : numbers) { // Bog O (n)
            System.out.println(number);
        }
        for (int number : numbers) { // Bog O (n)
            System.out.println(number);
        }
    }

    /**
     * @param numbers array of numbers
     */
    public static void innerLoop(int[] numbers) {
        // Big O(n^2)
        for (int first : numbers) { // Big O (n)
            for (int second : numbers) { // Big O (n)
                System.out.println(first);
            }
        }
    }
}
