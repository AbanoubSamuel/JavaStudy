package org.study.core;

@MyAnnotation("Class Level Annotation")
public class MyClass {
    @MyAnnotation("Method Level Annotation")
    public void myMethod() {
        // Method implementation
    }

    @MyAnnotation("Constructor Level Annotation")
    public MyClass() {
        // Constructor implementation
    }

    @MyAnnotation("Member Level Annotation")
    private String myField;

    // Other members and methods
}


