package org.study.generics;

import java.util.Arrays;


public class GenericList<T> {
    @Override
    public String toString() {
        return "GenericList{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }

    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}
