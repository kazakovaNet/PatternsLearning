package factory.pizzastore;

import factory.ingredients.NYPizzaIngredientsFactory;
import factory.ingredients.PizzaIngredientsFactory;
import factory.pizza.*;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientsFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientsFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientsFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientsFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
        }

        return pizza;
    }
}
