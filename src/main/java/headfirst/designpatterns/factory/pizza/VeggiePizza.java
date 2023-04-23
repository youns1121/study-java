package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.pizza.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중:" + super.name);
        super.dough = ingredientFactory.createDough();
        super.sauce = ingredientFactory.createSauce();
        super.cheese = ingredientFactory.createCheese();
        super.veggies = ingredientFactory.createVeggies();
    }
}
