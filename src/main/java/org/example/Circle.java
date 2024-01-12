package org.example;

public  class Circle extends Shape implements PerimeterCalculation{
    private double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}
