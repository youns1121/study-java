package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.pizza.cheese.Cheese;
import headfirst.designpatterns.factory.pizza.clams.Clams;
import headfirst.designpatterns.factory.pizza.dough.Dough;
import headfirst.designpatterns.factory.pizza.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza.sauce.Sauce;
import headfirst.designpatterns.factory.pizza.veggie.Veggies;

public abstract class Pizza {

    protected String name;

    protected Dough dough;

    protected Sauce sauce;

    protected Veggies veggies[];

    protected Cheese cheese;

    protected Pepperoni pepperoni;

    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{}";
    }
}
