package org.study.collections;

import java.util.*;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.addFirst("!");
        Collections.addAll(list, "a", "b", "c");
        list.set(0, "A+");
        System.out.println(list);
    }
}