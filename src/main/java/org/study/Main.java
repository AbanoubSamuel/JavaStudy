package org.study;


import org.study.study.CustomAnnotation;
import org.study.study.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static int countOccurrences(String str, String word)
    {
        // split the string by spaces in a
        String[] array = str.split("\\p{P}");

        // search for pattern in a
        int count = 0;
        for (String string : array) {
            // if match found increase count
            if (word.equals(string))
                count++;
        }

        return count;
    }

    // Driver code
//    public static void main(String[] args)
//    {
//        String str = "This is a sample sentence. It has some words, and words may repeat.";
//        String word = "words";
//        System.out.println("Word count using String methods: " + countOccurrences(str, word));
//    }
    public static void main(String[] args)
    {
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
        List<String> result = nameStream
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .toList();


        AbstractCollection<Object> abstractCollection = new AbstractCollection<Object>() {
            @Override
            public Iterator iterator()
            {
                return null;
            }

            @Override
            public int size()
            {
                return 0;
            }
        };
    }
}