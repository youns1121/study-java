package headfirst.designpatterns.decorator;

public class Mocha extends CondimenDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription()  + ", 모카";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + .20;
    }
}
