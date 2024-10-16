package org.study.ultimate.core;

@MyAnnotation("Class Level Annotation")
public class MyClass {
    @MyAnnotation("Member Level Annotation")
    private String myField;

    @MyAnnotation("Constructor Level Annotation")
    public MyClass() {
        // Constructor implementation
    }

    @MyAnnotation("Method Level Annotation")
    public void myMethod() {
        // Method implementation
    }

    // Other members and methods
}