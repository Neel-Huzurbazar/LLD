package DesignPatterns.Structural.Decorator.CoffeeShop;

public class MilkDecorator extends CoffeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" "+",Milk Added";
    }
    @Override
    public double getCost()
    {
        return super.getCost()+20;
    }

}
