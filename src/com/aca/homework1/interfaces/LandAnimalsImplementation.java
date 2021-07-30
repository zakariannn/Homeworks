package com.aca.homework1.interfaces;

public class LandAnimalsImplementation implements LandAnimals{
    @Override
    public void isBreathing() {
        System.out.println("Land Animal is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Land Animal is Running");
    }
}
