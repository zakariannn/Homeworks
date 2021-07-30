package com.aca.homework1.interfaces;

public class Frog implements WaterAnimals{
    public final String name = "FROG";

    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming");
    }
}
