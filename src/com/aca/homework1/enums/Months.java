package com.aca.homework1.enums;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUG,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

public static Months getMonth(int num){
        return Months.values()[num];
}

    public static void main(String[] args) {
        System.out.println(Months.getMonth(4));
        System.out.println(Months.getMonth(0));
        System.out.println(Months.getMonth(3));
    }
}
