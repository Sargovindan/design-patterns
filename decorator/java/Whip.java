public class Whip extends CondimentDecorator {
    private Beverage wrappedBeverage;

    public Whip(Beverage beverage) {
        this.wrappedBeverage = beverage;
    }

    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + wrappedBeverage.cost();
    }
}
