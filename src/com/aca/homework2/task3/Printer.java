package com.aca.homework2.task3;
import com.aca.homework2.task2.*;
import com.aca.homework2.task1.*;

public class Printer {
    public static void specialPrint(Object o){
        System.out.println("************************************");
        System.out.println(o.toString());
        System.out.println("************************************");
    }

    public static void main(String[] args) {
        Point point1 = new ImmutablePoint(1, 2);
        Point point2 = new ImmutablePoint(3, 4);
        Point point3 = new ImmutablePoint(5, 6);
        Triangle triangle = new Triangle(point1, point2, point3);
        ColoredTriangle coloredTriangle1 = new ColoredTriangle(point1, point2, point3, Color.BLACK);
        User user1 = new User("Name", "LastName", "Username","email");
        UserGroup userGroup1 = new UserGroup();
        for(int i = 0; i < 2; ++i)
        {
            userGroup1.addUser(user1);
        }
        Printer.specialPrint(triangle);
        System.out.println();
        Printer.specialPrint(coloredTriangle1);
        System.out.println();
        Printer.specialPrint(user1);
        System.out.println();
        Printer.specialPrint(userGroup1);
    }
}
