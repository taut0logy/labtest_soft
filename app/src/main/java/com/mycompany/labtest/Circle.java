package com.mycompany.labtest;

import androidx.annotation.NonNull;

public class Circle  extends Shape{
    double radius;

    public Circle(String name, Color color) {
        super(name, color);
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @NonNull
    @Override
    public String toString() {
        return this.color.showColor()+" Circle: " + name + ", radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
