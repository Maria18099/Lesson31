package org.example;

public interface PerimeterCalculation {
    double PI = 3.14;
    double perimeter();
    default double getPi(){
        return PI;
    }
}
