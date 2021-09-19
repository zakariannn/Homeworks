package com.aca.homework4.task2;

import java.io.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            File file = new File("C:/Users/marin/Desktop/Java/" + String.format("filename%s.txt", i));
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());
            for (int j = 0; j < 10000; j++) {
                printWriter.print(UUID.randomUUID().toString());
            }
        }
        System.out.println(Thread.currentThread());
    }
}
