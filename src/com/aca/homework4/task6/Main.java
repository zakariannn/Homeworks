package com.aca.homework4.task6;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            File file = new File("C:/Users/marin/Desktop/Java/" + String.format("filename%s.txt", i));
            RunnableImpl runnableImpl = new RunnableImpl(file);
            Thread thread = new Thread(runnableImpl);
            thread.start();
            thread.join();

        }

        System.out.println(RunnableImpl.list);

    }


}
