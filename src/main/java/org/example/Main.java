package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("TV",10000,6,new Standart());
        System.out.println(order.totalCost());
    }
}