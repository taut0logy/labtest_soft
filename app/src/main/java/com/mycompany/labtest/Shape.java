package com.mycompany.labtest;

public abstract class Shape {
    String name;
    Color color;

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract double getArea();
    abstract double getPerimeter();

    abstract public String toString();
}
