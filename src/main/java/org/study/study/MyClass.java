package org.study.study;


@CustomAnnotation("Class Level Annotation")
public class MyClass {

    @CustomAnnotation("Method Level Annotation")
    public void myMethod() {
        // Method implementation
    }

    @CustomAnnotation("Constructor Level Annotation")
    public MyClass() {
        // Constructor implementation
    }

    @CustomAnnotation("Member Level Annotation")
    private String myField;

    // Other members and methods
}


