package headfirst.designpatterns.decorator;

public class Decaf extends Beverage{

    public Decaf() {
        super.description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
