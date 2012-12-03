public class Mocha extends CondimentDecorator {
    private Beverage wrappedBeverage;

    public Mocha(Beverage beverage) {
        this.wrappedBeverage = beverage;
    }

    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + wrappedBeverage.cost();
    }
}
