package org.example;

public class Product {
    private String name;
    private double weight;
    private double price;
    public Product(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public double getPriceOfOneKG(){
        return price / weight * 1000;
    }

    @Override
    public String toString() {
        return name + " - " + getPriceOfOneKG();
    }
}
