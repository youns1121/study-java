package headfirst.designpatterns.factory.pizza.region.chicago;

import headfirst.designpatterns.factory.pizza.cheese.Cheese;
import headfirst.designpatterns.factory.pizza.cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.pizza.clams.Clams;
import headfirst.designpatterns.factory.pizza.clams.FrozenClams;
import headfirst.designpatterns.factory.pizza.dough.Dough;
import headfirst.designpatterns.factory.pizza.dough.ThickCrustDough;
import headfirst.designpatterns.factory.pizza.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizza.newyork.*;
import headfirst.designpatterns.factory.pizza.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizza.sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.pizza.sauce.Sauce;
import headfirst.designpatterns.factory.pizza.veggie.BlackOlives;
import headfirst.designpatterns.factory.pizza.veggie.EggPlant;
import headfirst.designpatterns.factory.pizza.veggie.Spinach;
import headfirst.designpatterns.factory.pizza.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new EggPlant(), new BlackOlives(), new Spinach() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
