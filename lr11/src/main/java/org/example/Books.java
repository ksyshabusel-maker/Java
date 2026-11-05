package org.example;

public class Books extends Product {
    public Books(String name, double price, double weight){
        super(name, price, weight);
    }
    @Override
    public double getDiscount(){ return 6;}

}
