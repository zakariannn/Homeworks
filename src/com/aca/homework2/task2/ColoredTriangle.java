package com.aca.homework2.task2;

import java.util.Objects;

public class ColoredTriangle extends Triangle {
    private final Color color;

    public ColoredTriangle(Point point1, Point point2, Point point3, Color color) {
        super(point1, point2, point3);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (getClass() != o.getClass()) {
            return getPoint1().equals(((Triangle) o).getPoint1())
                    && getPoint2().equals(((Triangle) o).getPoint2())
                    && getPoint3().equals(((Triangle) o).getPoint3());
        }
        ColoredTriangle triangle = (ColoredTriangle) o;
        return getPoint1().equals(((Triangle) o).getPoint1())
                && getPoint2().equals(((Triangle) o).getPoint2())
                && getPoint3().equals(((Triangle) o).getPoint3())
                && getColor().equals(((ColoredTriangle) o).getColor());
    }

    @Override
    public String toString() {
        super.toString();
        return "ColoredTriangle{" +
                "color=" + color +
                '}';
    }
}
