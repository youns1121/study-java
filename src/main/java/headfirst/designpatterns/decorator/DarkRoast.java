package headfirst.designpatterns.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.description = "다크 로스트";
    }

    @Override
    public double cost() {
        return .99;
    }
}
