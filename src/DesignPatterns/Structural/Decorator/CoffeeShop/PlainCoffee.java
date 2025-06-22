package DesignPatterns.Structural.Decorator.CoffeeShop;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 50;
    }
}
