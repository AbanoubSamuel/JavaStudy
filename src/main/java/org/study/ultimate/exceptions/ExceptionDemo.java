package org.study.ultimate.exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public void show() {
        try (var reader = new FileReader("file.txt");) {
            int value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File opened");
        } catch (IOException | ParseException e) {
            System.out.println("Could not read data");
        }
    }
}