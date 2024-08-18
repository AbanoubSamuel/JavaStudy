package org.study.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Customer c1 = new Customer("Yazer", "yazer@gmail.com");
        Customer c2 = new Customer("Abanoub", "Abanoub@gmail.com");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        System.out.println(map);
        Customer customer2 = map.get(c2.getEmail());
        System.out.println(customer2);
    }
}