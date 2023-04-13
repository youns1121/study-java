package headfirst.designpatterns.decorator;

public class Whip extends CondimenDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 휘핑크림 ";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + .10;
    }
}
