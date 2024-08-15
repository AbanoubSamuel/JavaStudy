package org.study.generics;

import java.util.Arrays;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    public T[] items;
    private int count;
    public GenericList(int size) {
        items = (T[]) new Object[size];
    }
    @Override
    public String toString() {
        return "GenericList{" + "items=" + Arrays.toString(items) + ", count=" + count + '}';
    }

    public void add(T item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index = 0;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}