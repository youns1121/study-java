package headfirst.designpatterns.factory.pizza.region.newyork;

import headfirst.designpatterns.factory.pizza.cheese.Cheese;
import headfirst.designpatterns.factory.pizza.cheese.ReggianoCheese;
import headfirst.designpatterns.factory.pizza.clams.Clams;
import headfirst.designpatterns.factory.pizza.clams.FreshClams;
import headfirst.designpatterns.factory.pizza.dough.Dough;
import headfirst.designpatterns.factory.pizza.dough.ThinCrustDough;
import headfirst.designpatterns.factory.pizza.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizza.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizza.sauce.MarinaraSauce;
import headfirst.designpatterns.factory.pizza.sauce.Sauce;
import headfirst.designpatterns.factory.pizza.veggie.*;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
