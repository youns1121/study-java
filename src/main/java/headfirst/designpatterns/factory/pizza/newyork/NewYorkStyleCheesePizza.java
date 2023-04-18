package headfirst.designpatterns.factory.pizza.newyork;


import headfirst.designpatterns.factory.pizza.Pizza;

public class NewYorkStyleCheesePizza extends Pizza {

    public NewYorkStyleCheesePizza() {
        super.name = "뉴욕 스타일 소스와 치즈 피자";
        super.dough = "씬 크러스트 도우";
        super.sauce = "마리나라 소스";
        super.toppings.add("잘게 썬 레지아노 치즈");
    }
}
