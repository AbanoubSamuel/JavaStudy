package org.study.oop.inheritance;

public class TextBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public String text = ""; // Field

    public TextBox() {
        System.out.println("Text Box Constructor");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}
