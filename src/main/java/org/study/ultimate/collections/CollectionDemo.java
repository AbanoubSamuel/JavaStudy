package org.study.ultimate.collections;

import java.util.*;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
//        Object[] objects = collection.toArray();
//        String[] strings = collection.toArray(new String[0]);
//        System.out.println(collection.contains("a"));
        Collection<String> other = new ArrayList<>(collection);
        System.out.println(collection == other);
        System.out.println("Objects are equal:" + collection.equals(other));
    }
}