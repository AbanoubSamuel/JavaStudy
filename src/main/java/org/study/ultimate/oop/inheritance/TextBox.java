package org.study.ultimate.oop.inheritance;

public class TextBox extends UIControl {
    public String text = ""; // Field

    public TextBox() {
        System.out.println("Text Box Constructor");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}