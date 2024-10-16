package org.study.ultimate.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void min(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUsers(GenericList<? extends User> users) {
        User user = (User) users.get(0);
    }

    public void printUser(User user) {
        System.out.println(user);
    }
}