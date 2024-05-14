package org.study.dsa;

public class Array {
    public static int[] insert(int n, int[] arr, int x) {
        // create a new array of size n+1
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
        }
        newArray[n] = x;

        return newArray;
    }

    public void print(Integer[] numbers) {
        for (Integer a : numbers) {
            System.out.println(a);
        }
    }
}
