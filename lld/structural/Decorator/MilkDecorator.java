package lld.structural.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 0.50;
    }
}
