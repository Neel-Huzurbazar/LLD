package DesignPatterns.Behavioral.Strategy;

public class Car implements Navigation {
    @Override
    public void calculateRoute() {
        System.out.println("Navigating by car");
    }
}
