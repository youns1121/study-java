package headfirst.designpatterns.factory.pizza.california;

import headfirst.designpatterns.factory.pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        super.name = "페퍼로니가 많이 들어간 피자";
        super.dough = "치즈크러스트";
        super.sauce = "스위트 칠리 맣이 마니";
        super.toppings.add("고구마");
        super.toppings.add("옥수수");
        super.toppings.add("양송이 버섯");
        super.toppings.add("피자 치즈");
        super.toppings.add("양송이");
    }

    @Override
    public void bake() {
        System.out.println("빵을 불가마 200도에서 바싹 굽기");
    }

    @Override
    public void cut() {
        System.out.println("대각선으로 한번 직각으로 한번 총 두번 자르기");
    }

    @Override
    public void box() {
        System.out.println("피자를 상자에 담기");
    }
}
