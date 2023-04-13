package headfirst.designpatterns.decorator;

public abstract class CondimenDecorator extends Beverage{

    Beverage beverage;
    public abstract String getDescription();
}
