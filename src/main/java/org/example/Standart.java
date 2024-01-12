package org.example;

public class Standart implements ShippingStrategy{
    @Override
    public double calculate(Order order) {
        if(order.getWeight()>10){
            return 10;
        }
        else{
            return 5;
        }
    }
}
