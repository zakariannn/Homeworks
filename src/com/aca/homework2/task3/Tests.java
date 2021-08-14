package com.aca.homework2.task3;

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of clock do you prefer");
        System.out.println("Insert 1 for FastClock");
        System.out.println("Insert 2 for SlowClock");
        int cin = scanner.nextInt();
        if(cin == 1)
        {
            Clock fastClock = new FastClock();
            fastClock.start();
        }else if(cin == 2){
            Clock slowClock = new SlowClock();
            slowClock.start();
        }else{
            throw new RuntimeException("Wrong input");
        }
    }
}
