public class Soy extends CondimentDecorator {
    private Beverage wrappedBeverage;

    public Soy(Beverage beverage) {
        this.wrappedBeverage = beverage;
    }

    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + wrappedBeverage.cost();
    }
}
