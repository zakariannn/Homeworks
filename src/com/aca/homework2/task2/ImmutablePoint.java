package com.aca.homework2.task2;

import java.util.Objects;

public class ImmutablePoint implements Point {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Point shiftLeft(ImmutablePoint p) {
        Point newPoint = new Point() {
            @Override
            public int getX() {
                return x - 1;
            }

            @Override
            public int getY() {
                return y;
            }
        };
        return newPoint;
    }

    public Point shiftRight(ImmutablePoint p) {
        Point newPoint = new Point() {
            @Override
            public int getX() {
                return x + 1;
            }

            @Override
            public int getY() {
                return y;
            }
        };
        return newPoint;
    }

    public Point shiftUp(ImmutablePoint p) {
        Point newPoint = new Point() {
            @Override
            public int getX() {
                return x;
            }

            @Override
            public int getY() {
                return y + 1;
            }
        };
        return newPoint;
    }

    public Point shiftDown(ImmutablePoint p) {
        Point newPoint = new Point() {
            @Override
            public int getX() {
                return x;
            }

            @Override
            public int getY() {
                return y - 1;
            }
        };
        return newPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutablePoint)) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
