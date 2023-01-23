package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("Apple", 15));
        vendingMachine.getProductList().add(new Product("Pear", 25));
        vendingMachine.getProductList().add(new Product("PineApple", 35));
        vendingMachine.getProductList().add(new Baton("Mars", 15, 20.20));
        vendingMachine.getProductList().add(new SuperBaton("Super Mars", 15, 30.30, TypeSize.MIDDLE));
        vendingMachine.getProductList().add(new Milk("Prostokvashino", 85, 3.2));
        vendingMachine.getProductList().add(new Melon("Torpedo", 55, 55.0));
        for (Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }
}