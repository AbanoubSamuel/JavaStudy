package org.study;

import org.study.core.*;
import org.study.dsa.Array;
import org.study.oop.Human;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.study.ps.Currency.countCurrency;

public class Main {
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;

        // Class level annotation
        if (myClass.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation classAnnotation = myClass.getAnnotation(CustomAnnotation.class);
            System.out.println("Class Annotation: " + classAnnotation.value());
        }

        // Method level annotation
        for (Method method : myClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation methodAnnotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method Annotation: " + methodAnnotation.value());
            }
        }

        // Constructor level annotation
        for (Constructor<?> constructor : myClass.getDeclaredConstructors()) {
            if (constructor.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation constructorAnnotation = constructor.getAnnotation(CustomAnnotation.class);
                System.out.println("Constructor Annotation: " + constructorAnnotation.value());
            }
        }

        // Member level annotation
        for (Field field : myClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation fieldAnnotation = field.getAnnotation(CustomAnnotation.class);
                System.out.println("Field Annotation: " + fieldAnnotation.value());
            }
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        IntStream.of(numbers).forEach(number -> System.out.println("value: " + number));

//        for (int num : numbers) {
//            System.out.println(num);
//        }

//        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
//        nameStream.forEach(System.out::println);

        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        List<String> result = nameStream.filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e)).toList();

        AbstractCollection<Object> abstractCollection = new AbstractCollection<>() {
            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        System.out.println("-----------DSA-----------");
        Array items = new Array(3);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);
        items.indexOf(50);
        System.out.println(items.indexOf(50));
        items.print();
        Human human = new Human();
        System.out.println(human);
        human.setName("Abanoub");

        int[] plants = new int[5];
        plants[0] = 1;
        plants[1] = 2;
        // Access and modify elements directly
        int value = plants[1];
        String[] stringArray = new String[5];  // Array of String objects
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("========== Currency ==========");
        int amount = 868;
        countCurrency(amount);

        System.out.println("========== Double Column ==========");
        // Referring static method
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method
        sayable.say();
    }
}