package org.example;

public class Milk extends Product {
    private double fatContent;

    public Milk(String name, double cost, double fatContent) {
        super(name, cost);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " fatContent: %.1f", this.fatContent);
    }

    public double getFatContent() {
        return fatContent;
    }
}
