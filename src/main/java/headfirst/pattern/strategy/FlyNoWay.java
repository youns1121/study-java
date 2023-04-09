package headfirst.pattern.strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("전는 못 날아요");
    }
}
