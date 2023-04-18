package headfirst.designpatterns.factory.pizza.chicago;

import headfirst.designpatterns.factory.pizza.Pizza;
import headfirst.designpatterns.factory.pizza.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {

        if("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if("pepperoni".equals(item)) {
            return new ChicagoStylePepperoniPizza();
        }

        return null;
    }
}
