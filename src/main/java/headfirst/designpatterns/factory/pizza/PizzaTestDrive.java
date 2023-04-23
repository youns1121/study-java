package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.pizza.factory.PizzaStore;
import headfirst.designpatterns.factory.pizza.region.california.CaliforniaStylePizzaStore;
import headfirst.designpatterns.factory.pizza.region.chicago.ChicagoStylePizzaStore;
import headfirst.designpatterns.factory.pizza.region.newyork.NewYorkPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore newYorkStore = new NewYorkPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore californiaStore = new CaliforniaStylePizzaStore();

        Pizza pizza = newYorkStore.orderPizza("clam");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("pepperoni");
        System.out.println("민식이가 주문한 " + pizza.getName() + "\n");
    }
}
