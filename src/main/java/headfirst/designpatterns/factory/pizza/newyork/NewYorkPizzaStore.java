package headfirst.designpatterns.factory.pizza.newyork;


import headfirst.designpatterns.factory.pizza.Pizza;
import headfirst.designpatterns.factory.pizza.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {

        if("cheese".equals(item)) {
            return new NewYorkStyleCheesePizza();
        } else if("veggie".equals(item)) {
            return new NewYorkStyleVeggiePizza();
        } else if("clam".equals(item)) {
            return new NewYorkStyleClamPizza();
        } else if("pepperoni".equals(item)) {
            return new NewYorkStylePepperoniPizza();
        }

        return null;
    }
}
