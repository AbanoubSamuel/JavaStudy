package org.study;

import org.study.core.*;
import org.study.oop.Employee;
import org.study.oop.TextBox;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
//        Class<MyClass> myClass = MyClass.class;
//
//        // Class level annotation
//        if (myClass.isAnnotationPresent(MyAnnotation.class)) {
//            MyAnnotation classAnnotation = myClass.getAnnotation(MyAnnotation.class);
//            System.out.println("Class Annotation: " + classAnnotation.value());
//        }
//
//        // Method level annotation
//        for (Method method : myClass.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(CustomAnnotation.class)) {
//                CustomAnnotation methodAnnotation = method.getAnnotation(CustomAnnotation.class);
//                System.out.println("Method Annotation: " + methodAnnotation.value());
//            }
//        }
//
//        // Constructor level annotation
//        for (Constructor<?> constructor : myClass.getDeclaredConstructors()) {
//            if (constructor.isAnnotationPresent(CustomAnnotation.class)) {
//                CustomAnnotation constructorAnnotation = constructor.getAnnotation(CustomAnnotation.class);
//                System.out.println("Constructor Annotation: " + constructorAnnotation.value());
//            }
//        }
//
//        // Member level annotation
//        for (Field field : myClass.getDeclaredFields()) {
//            if (field.isAnnotationPresent(CustomAnnotation.class)) {
//                CustomAnnotation fieldAnnotation = field.getAnnotation(CustomAnnotation.class);
//                System.out.println("Field Annotation: " + fieldAnnotation.value());
//            }
//        }
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//        IntStream.of(numbers).forEach(number -> System.out.println("value: " + number));
//
////        for (int num : numbers) {
////            System.out.println(num);
////        }
//
////        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
////        nameStream.forEach(System.out::println);
//
//        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
//        List<String> result = nameStream.filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e)).toList();
//
//        AbstractCollection<Object> abstractCollection = new AbstractCollection<>() {
//            @Override
//            public Iterator iterator() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//        };
//        System.out.println("-----------DSA-----------");
//        Array items = new Array(3);
//        items.insert(10);
//        items.insert(20);
//        items.insert(30);
//        items.insert(40);
//        items.indexOf(50);
//        System.out.println(items.indexOf(50));
//        items.print();
//        Human human = new Human();
//        System.out.println(human);
//        human.setName("Abanoub");

//        int[] plants = new int[5];
//        plants[0] = 1;
//        plants[1] = 2;
//        // Access and modify elements directly
//        int value = plants[1];
//        String[] stringArray = new String[5];  // Array of String objects
//        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println("========== Currency ==========");
//        int amount = 868;
//        countCurrency(amount);
//
//        System.out.println("========== Double Column ==========");
//        // Referring static method
//        Sayable sayable = MethodReference::saySomething;
//        // Calling interface method
//        sayable.say();
//        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(numbers2));
//        System.out.println("========== Arithmetic Ops ==========");
//        double number = (double) 10 / (double) 3;
//        System.out.println(number);
//        byte age = 127;
//        String result = NumberFormat.getInstance().format(2.5);
//        System.out.println(result);
//        byte temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 25;
//        System.out.println("Weather is warm: " + isWarm);
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//        System.out.println(hasHighIncome);

        try {
            // Load the Person class
            Class<?> personClass = Class.forName("org.study.core.Person");

            // Create an instance of Person using the default constructor
            Object personInstance = personClass.getDeclaredConstructor().newInstance();

            // Access the 'name' field and set its value
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // Allows access to private fields
            nameField.set(personInstance, "John");

            // Access the 'age' field and set its value
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(personInstance, 30);

            // Invoke the 'sayHello' method
            Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
            sayHelloMethod.invoke(personInstance);

            // Print the values using getters
            Method getNameMethod = personClass.getDeclaredMethod("getName");
            Method getAgeMethod = personClass.getDeclaredMethod("getAge");
            System.out.println("Name: " + getNameMethod.invoke(personInstance));
            System.out.println("Age: " + getAgeMethod.invoke(personInstance));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        System.out.println("======== OOP =========");
//        TextBox textBox1 = new TextBox();
//        TextBox textBox2 = textBox1;
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//        System.out.println(textBox2.text.toUpperCase());
//        System.out.println("======== Employee =========");
//        Employee employee1 = new Employee();
//        employee1.setBaseSalary(50_000);
//        employee1.setHourlyRate(20);
//        System.out.println(employee1.calculateSalary(10));
//        int result = (19 / 3);
//        System.out.println(result);
    }
}