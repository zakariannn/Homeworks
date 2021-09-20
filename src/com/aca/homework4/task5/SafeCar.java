package com.aca.homework4.task5;


public class SafeCar implements Car {
    private String[] passengers = new String[6];
    private int counter = 0;

    @Override
    public synchronized void addPassenger(String passengerName) {
        if (counter < 6) {
            this.passengers[counter] = passengerName;
            ++counter;
            System.out.println("Setting passenger");

        } else {
            System.out.println("No places available");
        }
        notifyAll();
    }

    @Override
    public synchronized void printPassengersNames() throws InterruptedException {
        for (String s : this.passengers) {
            if (s == null) {
                wait();
            }
        }
        for (String s : this.passengers) {
            System.out.println(s);

        }

    }
}
