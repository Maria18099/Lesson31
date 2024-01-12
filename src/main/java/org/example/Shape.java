package org.example;

public abstract class Shape {
    private String type;
    public Shape(String type){
        this.type = type;
    }
    public String toString(){
        return type;
    }
    public abstract double area();
}
