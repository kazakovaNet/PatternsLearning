package factory.pizza;

import factory.ingredients.PizzaIngredientsFactory;
import factory.pizza.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}
