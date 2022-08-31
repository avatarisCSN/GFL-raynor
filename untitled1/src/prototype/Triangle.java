package prototype;

import java.awt.*;

public class Triangle implements Cloneable {
    private double a;
    private double b;
    private double c;

    private Color color;

    public Triangle(double a, double b, double c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException {
        return (Triangle) super.clone();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color=" + color +
                '}';
    }
}
