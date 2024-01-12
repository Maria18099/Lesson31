package org.example;

public class Express implements ShippingStrategy{
    @Override
    public double calculate(Order order) {
        if(order.getWeight()>10){
            return 30;
        }
        else {
            return 20;
        }
    }
}
