package com.aca.homework2.task2;

public class Tests {
    public static void main(String[] args) {
        Point point1 = new ImmutablePoint(1, 2);
        Point point2 = new ImmutablePoint(3, 4);
        Point point3 = new ImmutablePoint(5, 6);
        Triangle triangle = new Triangle(point1, point2, point3);
        ColoredTriangle coloredTriangle1 = new ColoredTriangle(point1, point2, point3, Color.BLACK);
        ColoredTriangle coloredTriangle2 = new ColoredTriangle(point1, point2, point3, Color.BLACK);
        ColoredTriangle coloredTriangle3 = new ColoredTriangle(point1, point2, point3, Color.GREY);
        System.out.println(coloredTriangle1.equals(coloredTriangle2));
        System.out.println(coloredTriangle1.equals(coloredTriangle3));
        System.out.println(coloredTriangle1.equals(triangle));
    }
}
