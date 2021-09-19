package com.aca.homework4.task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new RunnableImpl()).run();
        }
    }
}
