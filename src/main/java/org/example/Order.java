package org.example;

public class Order {
    private String name;
    private double weight;
    private double cost;
    private ShippingStrategy shippingStrategy;//Standart

    public Order(String name, double cost, double weight, ShippingStrategy shippingStrategy) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.shippingStrategy = shippingStrategy;
    }

    public double getWeight() {
        return weight;
    }

    public double totalCost(){
        return cost+shippingStrategy.calculate(this);
    }
}
