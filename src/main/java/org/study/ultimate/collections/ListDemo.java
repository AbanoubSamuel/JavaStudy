package org.study.ultimate.collections;

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
        System.out.println(list.lastIndexOf("A+"));
        System.out.println(list.subList(0, 2));
    }
}