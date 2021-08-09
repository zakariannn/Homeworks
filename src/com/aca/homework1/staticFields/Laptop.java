package com.aca.homework1.staticFields;

public class Laptop {
    public static int countPub;
    public static int countProt;
    private String name;

    public Laptop() {
        ++countPub;
    }

    protected Laptop(String name) {
        this.name = name;
        ++countProt;
    }

    public static int getCountPub() {
        return countPub;
    }

    public static int getCountProt() {
        return countProt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Mac");
        Laptop l3 = new Laptop("Asus");
        Laptop l4 = new Laptop();
        Laptop l5 = new Laptop();
        l5.setName("Acer");
        System.out.println(l5.getName());
        System.out.println(Laptop.getCountPub());
        System.out.println(Laptop.getCountProt());
    }
}
