package org.study.dsa;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    /**
     * @param item add item to array
     */
    public void insert(int item) {
        // If the array is full
        if (items.length == count) {
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

    /**
     * print array to console
     */
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
