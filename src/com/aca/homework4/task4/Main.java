package com.aca.homework4.task4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            File file = new File("C:/Users/marin/Desktop/Java/" + String.format("filename%s.txt", i));
            ConcurrentProcessing concurrentProcessing = new ConcurrentProcessing(file);
            new Thread(concurrentProcessing).start();
        }
    }
}
