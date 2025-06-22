package DesignPatterns.Behavioral.Strategy;

public class Train implements Navigation {
    @Override
    public void calculateRoute() {
        System.out.println("Navigating by train");
    }
}
