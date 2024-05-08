package com.mycompany.labtest;

public class Square  extends Shape{
    double side;

    public Square(String name, Color color) {
        super(name,color);
        this.side = 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return this.color.showColor() +  " Square: " + name + ", side: " + side + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
