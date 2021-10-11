package java8.designpattern.templatemethod;

public class Gun implements Weapon{

    @Override
    public void attack() {
        System.out.println("빵야! 빵야!");
    }
}
