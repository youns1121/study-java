package headfirst.designpatterns.factory.pizza.region.newyork;


import headfirst.designpatterns.factory.pizza.*;
import headfirst.designpatterns.factory.pizza.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizza.factory.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();

        if ("cheese".equals(item)) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");

        } else if ("veggie".equals(item)) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");

        } else if ("clam".equals(item)) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");

        } else if("pepperoni".equals(item)) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");

        }
        return pizza;
    }

//    @Override
//    public Pizza createPizza(String item) {
//
//        if("cheese".equals(item)) {
//            return new NewYorkStyleCheesePizza();
//        } else if("veggie".equals(item)) {
//            return new NewYorkStyleVeggiePizza();
//        } else if("clam".equals(item)) {
//            return new NewYorkStyleClamPizza();
//        } else if("pepperoni".equals(item)) {
//            return new NewYorkStylePepperoniPizza();
//        }
//
//        return null;
//    }
}
