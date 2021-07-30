package com.aca.homework1.interfaces;

public class WaterAnimalsImplemetation implements WaterAnimals{
    @Override
    public void isSwimming() {
        System.out.println("Water animal is swimming");
    }

    @Override
    public void isBreathing() {
        System.out.println("Water animal is breathing");
    }
}
