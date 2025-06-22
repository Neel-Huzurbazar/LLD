package DesignPatterns.Structural.Decorator.CoffeeShop;

public abstract class CoffeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    public CoffeDecorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee=decoratedCoffee;
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription();
    }
    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost();
    }
}
