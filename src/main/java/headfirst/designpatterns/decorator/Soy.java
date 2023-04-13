package headfirst.designpatterns.decorator;

public class Soy extends CondimenDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + .15;
    }
}
