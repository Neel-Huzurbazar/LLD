package DesignPatterns.Behavioral.Strategy;

public class Walk implements Navigation{
    @Override
    public void calculateRoute() {
        System.out.println("Navigating by walk");
    }
}
