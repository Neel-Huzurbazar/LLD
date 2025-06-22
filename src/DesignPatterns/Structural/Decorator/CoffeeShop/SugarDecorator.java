package DesignPatterns.Structural.Decorator.CoffeeShop;

public class SugarDecorator extends CoffeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" "+",Sugar Added";
    }
    @Override
    public double getCost()
    {
        return super.getCost()+10;
    }
}
