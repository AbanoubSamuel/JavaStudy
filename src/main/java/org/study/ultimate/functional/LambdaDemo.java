package org.study.ultimate.functional;

import java.util.*;
import java.util.function.*;
import java.util.stream.LongStream;

public class LambdaDemo {
    public static void show() {
        greet(System.out::println);
        // Method reference
        greet(LambdaDemo::methodReference);
        // Constructor reference
        greet(LambdaDemo::new);

        List<String> list = List.of("a", "b", "c");
        //////// Consumer Interface //////////
        Consumer<String> consumer = System.out::println;
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        printUpperCase.accept("toUpperCase: hello");
        //////// Consumer Chaining //////////
        list.forEach(consumer.andThen(printUpperCase)
                             .andThen(System.out::println));
        //////// Supplier Interface & Lazy evaluation //////////
        Supplier<Double> random1 = Math::random;
        Double random = random1.get();
        System.out.println(random);
        // ToDo Implement more logic with the supplier interface.
        // ToDo: This is a heavy calculation done with the Supplier.
        Supplier<Long> heavyCalculationSupplier = () -> {
            System.out.println("Performing heavy calculation...");
            return LongStream.rangeClosed(1, 10_000_000_00)
                             .parallel()
                             .map(n -> n * n)
                             .map(n -> n + n)
                             .map(n -> n * n)
                             .sum();
        };

        System.out.println("Before calling get method");
        long result = heavyCalculationSupplier.get();
        System.out.println("After calling get method");

        // Output the result
        System.out.println("Result of heavy calculation: " + result);
        System.out.println("========== Function Interface ==========");
        Function<String, Integer> str = String::length;
        System.out.println(str.apply("Abanoub"));

        ///////////// Composed Functions ///////////////
        System.out.println("========== Composed Functions ==========");
        Function<String, String> replaceColon = string -> string.replace(":", "=");
        Function<String, String> addBraces = string -> "{{" + string + "}}";
        Function<String, String> toUpperCase = String::toUpperCase;
        String result1 = replaceColon.andThen(addBraces)
                                     .andThen(toUpperCase)
                                     .apply("key:value");
        System.out.println(result1);
        System.out.println("========== Predicate Interface ==========");
        Predicate<String> isLongerThan5 = str1 -> str1.length() > 5;
        boolean resultBoolean = isLongerThan5.test("abc");
        System.out.println(resultBoolean);
        Predicate<String> hasRBraces = str2 -> str2.startsWith("{");
        Predicate<String> hasLBraces = str3 -> str3.endsWith("}");
        Predicate<String> hasRLBraces = hasLBraces.and(hasRBraces);
        System.out.println(hasRLBraces.test("{abc}"));
        Predicate<String> orResult = hasLBraces.or(hasRBraces);
        System.out.println(orResult.test("abc}"));
        System.out.println("========== BinaryOperator Interface ==========");
        BinaryOperator<Integer> add = Integer::sum;
        Function<Integer, Integer> square = x -> x * x;
        Integer resultOfMath = add.andThen(square)
                                  .apply(1, 2);
        System.out.println(resultOfMath);
        /////////////// UnitaryOperator Interface /////////////////
        System.out.println("========== UnaryOperator Interface ==========");
        UnaryOperator<Integer> squaredUnary = n -> n * n;
        UnaryOperator<Integer> incrementedUnary = n -> n + n;
        System.out.println(incrementedUnary.apply(5));
    }

    public LambdaDemo(String string) {
    }

    public static void methodReference(String text) {
        System.out.println(text);
    }

    public static void greet(Printer printer) {
        printer.print("Hello, World!");
    }
}