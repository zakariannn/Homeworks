package com.aca.homework4.task1;

import java.util.UUID;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(String.format(UUID.randomUUID().toString() + "%s", Thread.currentThread()));
    }

}
