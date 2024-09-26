package org.study;

import org.study.concurrency.executers.*;
import org.study.core.*;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /////////// CustomAnnotation /////////////
        Class<MyClass> myClass = MyClass.class;

        // Class level annotation
//        if (myClass.isAnnotationPresent(MyAnnotation.class)) {
//            MyAnnotation classAnnotation = myClass.getAnnotation(MyAnnotation.class);
//            System.out.println("Class Annotation: " + classAnnotation.value());
//        }
//
//        // Method level annotation
//        for (Method method : myClass.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(MyAnnotation.class)) {
//                MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
//                System.out.println("Method Annotation: " + methodAnnotation.value());
//            }
//        }
//
//        // Constructor level annotation
//        for (Constructor<?> constructor : myClass.getDeclaredConstructors()) {
//            if (constructor.isAnnotationPresent(MyAnnotation.class)) {
//                MyAnnotation constructorAnnotation = constructor.getAnnotation(MyAnnotation.class);
//                System.out.println("Constructor Annotation: " + constructorAnnotation.value());
//            }
//        }
//
//        // Member level annotation
//        for (Field field : myClass.getDeclaredFields()) {
//            if (field.isAnnotationPresent(MyAnnotation.class)) {
//                MyAnnotation fieldAnnotation = field.getAnnotation(MyAnnotation.class);
//                System.out.println("Field Annotation: " + fieldAnnotation.value());
//            }
//        }
        ////////////// Stream API //////////////
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
//
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
        ///////////////////////// Reflection API /////////////////////////
//        try {
//            // Load the Person class
//            Class<?> personClass = Class.forName("org.study.core.Person");
//
//            // Create an instance of Person using the default constructor
//            Object personInstance = personClass.getDeclaredConstructor()
//                                               .newInstance();
//
//            // Access the 'name' field and set its value
//            Field nameField = personClass.getDeclaredField("name");
//            nameField.setAccessible(true); // Allows access to private fields
//            nameField.set(personInstance, "John");
//
//            // Access the 'age' field and set its value
//            Field ageField = personClass.getDeclaredField("age");
//            ageField.setAccessible(true);
//            ageField.set(personInstance, 30);
//
//            // Invoke the 'sayHello' method
//            Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
//            sayHelloMethod.invoke(personInstance);
//
//            // Print the values using getters
//            Method getNameMethod = personClass.getDeclaredMethod("getName");
//            Method getAgeMethod = personClass.getDeclaredMethod("getAge");
//            System.out.println("Name: " + getNameMethod.invoke(personInstance));
//            System.out.println("Age: " + getAgeMethod.invoke(personInstance));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        ////////////////////////// OOP /////////////////////////
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
//        UIControl uiControl = new UIControl();
//        uiControl.isEnabled();
//        UIControl[] controls = new UIControl[]{new TextBox(), new CheckBox()};
//        for (UIControl control : controls) {
//            control.render();
//        }
//
//        TaxCalculator taxCalculator = new TaxCalculator2020();
//        taxCalculator.calculateTax();
//        TaxReport taxReport = new TaxReport(taxCalculator);
//        taxReport.show();
//        TaxCalculator taxCalculator1 = new TaxCalculator2024();
//        TaxReport taxReport1 = new TaxReport(taxCalculator1);
//        taxReport1.show();
//        GenericList<Object> list = new GenericList<>();
//        list.add(1);
//        list.add(new User(10));
//        list.get(1);
//        System.out.println(list);
//        System.out.println("======================");
//        System.out.println("======================");
//        var max = Utils.max(new User(10), new User(25));
//        System.out.println(max);
//        System.out.println("===================");
//        Utils.min(1, "Hello");
//        KeyValuePair<Integer, Integer> keyValuePair = new KeyValuePair<>(1, 2);
//        keyValuePair.print();
//        GenericList<User> users = new GenericList<>();
//        GenericList<Instructor> instructors = new GenericList<>();
//        Utils.printUsers(users);
//        Utils.printUsers(instructors);
//        System.out.println("========== Iterable =========");
//        System.out.println("========== Iterable =========");
//        GenericList<String> list = new GenericList<>(10);
//        list.add("item 1");
//        list.add("item 2");
//
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        GenericList<Integer> ints = new GenericList<>(10);
//        ints.add(1);
//        ints.add(2);
//        for (Integer item : ints) {
//            System.out.println(item);
//        }
        /////////////// Collection & List Interfaces //////////////
//        System.out.println("========== Collection Demo =========");
//        System.out.println("========== Collection Demo =========");
//        CollectionDemo.show();
//        System.out.println("========== List Demo =========");
//        System.out.println("========== List Demo =========");
//        ListDemo.show();
//        System.out.println("========== Comparable Interface =========");
//        System.out.println("========== Comparable Interface =========");
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("B", "e4"));
//        customers.add(new Customer("A", "e3"));
//        customers.add(new Customer("C", "e2"));
//        customers.add(new Customer("D", "e1"));
//        System.out.println(customers);
//        customers.sort(new EmailComparator());
//        System.out.println(customers);
//        ////////////// Queue Interface //////////////////
//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("B");
//        queue.add("C");
//        queue.add("A");
//        String peeked = queue.peek();
//        String element = queue.element();
//        System.out.println("Front element: " + peeked);
//        queue.remove();
//        System.out.println("Queue : " + queue);
//        ////////////// Set Interface //////////////////
//        Set<String> set = new HashSet<>();
//        set.add("B");
//        set.add("C");
//        set.add("D");
//        set.add("D");
//        System.out.println(set);
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "A", "B", "C", "C");
//        Set<String> set1 = new HashSet<>(collection);
//        System.out.println(set1);
//        System.out.println("============ Combining Sets =============");
//        Set<String> set2 = new HashSet<>(Arrays.asList("A", "B", "C"));
//        Set<String> set3 = new HashSet<>(Arrays.asList("C", "D", "F"));
//        set2.addAll(set3);
//        System.out.println(set2);
        /////////////// Map Interface ////////////////
//        MapDemo.show();
        //////////////// Lambda Expression & Function Interfaces //////////////
//        LambdaDemo.show();
//        final List<Integer> integers = List.of(1, 2, 3);
//        integers.forEach(System.out::println);

        ////////////// Stream Demo /////////////
//        StreamDemo.show();
//        SubSealed.show();
//        ConcurrencyDemo.syncedCollections();
//        ExecutorDemo.show();
          CompletableFutureDemo.handleTimeOuts();
//        MailService service = new MailService();
//        service.sendAsync();
//        System.out.println("Hello World!");
//
//        Thread.sleep(5000);
    }
}