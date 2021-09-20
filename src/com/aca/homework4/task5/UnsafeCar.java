package com.aca.homework4.task5;

public class UnsafeCar implements Car {
    private String[] passengers = new String[6];
    private int counter = 0;

    @Override
    public void addPassenger(String passengerName) {
        if (counter < 6) {
            this.passengers[counter] = passengerName;
            ++counter;
            System.out.println("Setting passenger");

        } else {
            System.out.println("No places available");
        }

    }

    @Override
    public void printPassengersNames() throws InterruptedException {
        for (String s : this.passengers) {
            System.out.println(s);

        }

    }
}
