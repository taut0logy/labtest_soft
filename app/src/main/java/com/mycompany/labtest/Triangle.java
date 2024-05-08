package com.mycompany.labtest;

public class Triangle  extends Shape{
    double base, height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(String name, Color color) {
        super(name,color);
        this.base = 0;
        this.height = 0;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public String toString() {
        return this.color.showColor() +" Triangle: " + name + ", base: " + base + ", height: " + height + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
