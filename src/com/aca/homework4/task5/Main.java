package com.aca.homework4.task5;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        SafeCar safeCar = new SafeCar();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; ++i) {
                    safeCar.addPassenger("Passenger " + i);
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    safeCar.printPassengersNames();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread1.start();
        thread2.start();


    }
}
