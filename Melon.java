package org.example;

public class Melon extends Product {
    private double sugar;

    public Melon(String name, double cost, double sugar) {
        super(name, cost);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " sugar: %.1f", this.sugar);
    }

    public double getSugar() {
        return sugar;
    }
}
