package headfirst.designpatterns.factory.pizza.factory;

import headfirst.designpatterns.factory.pizza.cheese.Cheese;
import headfirst.designpatterns.factory.pizza.clams.Clams;
import headfirst.designpatterns.factory.pizza.dough.Dough;
import headfirst.designpatterns.factory.pizza.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza.sauce.Sauce;
import headfirst.designpatterns.factory.pizza.veggie.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
