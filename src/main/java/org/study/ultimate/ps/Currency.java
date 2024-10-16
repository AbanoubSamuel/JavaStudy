package org.study.ultimate.ps;

public class Currency {
    public static void countCurrency(int number) {

        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCounter = new int[9];

        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (number >= notes[i]) {
                noteCounter[i] = number / notes[i];
                number = number % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
}