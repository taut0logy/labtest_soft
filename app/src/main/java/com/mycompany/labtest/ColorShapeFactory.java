package com.mycompany.labtest;

public class ColorShapeFactory {

    public Shape getShape(String type, String colorName) {
        Color Color = null;
        if (colorName.equalsIgnoreCase("Red")) {
            Color = new RedColor();
        } else if (colorName.equalsIgnoreCase("Green")) {
            Color = new GreenColor();
        } else if (colorName.equalsIgnoreCase("Blue")) {
            Color = new BlueColor();
        }
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle("Circle", Color);
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square("Square", Color);
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Triangle("Triangle", Color);
        }
        return null;
    }

}
