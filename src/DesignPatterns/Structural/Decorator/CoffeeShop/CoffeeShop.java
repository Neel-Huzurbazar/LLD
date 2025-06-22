package DesignPatterns.Structural.Decorator.CoffeeShop;

public class CoffeeShop {

    public static void main(String[] args) {
        Coffee simpleCoffe = new PlainCoffee();
        System.out.println(simpleCoffe.getDescription()+" "+simpleCoffe.getCost());

        Coffee milkDecoratoredCofee= new MilkDecorator(simpleCoffe);
        System.out.println(milkDecoratoredCofee.getDescription()+" "+milkDecoratoredCofee.getCost());

        Coffee sugarDecoratoredCofee= new SugarDecorator(simpleCoffe);
        System.out.println(sugarDecoratoredCofee.getDescription()+" "+sugarDecoratoredCofee.getCost());

    }
}
