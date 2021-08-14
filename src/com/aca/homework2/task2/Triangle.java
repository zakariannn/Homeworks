package com.aca.homework2.task2;

import java.util.Objects;

public class Triangle extends AssertionUtils {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        notNull(point1);
        notNull(point2);
        notNull(point3);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Triangle triangle) {
        point1 = triangle.getPoint1();
        point2 = triangle.getPoint2();
        point3 = triangle.getPoint3();

    }

    public Point getPoint1() {

        return new ImmutablePoint(point1.getX(), point1.getY());
    }

    public Point getPoint2() {
        return new ImmutablePoint(point2.getX(), point2.getY());
    }

    public Point getPoint3() {
        return new ImmutablePoint(point3.getX(), point3.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getPoint1().equals(((Triangle) o).getPoint1())
               && getPoint2().equals(((Triangle) o).getPoint2())
               && getPoint3().equals(((Triangle) o).getPoint3());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + getPoint1() +
                ", point2=" + getPoint2() +
                ", point3=" + getPoint3() +
                '}';
    }

}
