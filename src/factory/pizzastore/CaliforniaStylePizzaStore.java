package factory.pizzastore;

import factory.ingredients.CaliforniaPizzaIngredientsFactory;
import factory.ingredients.PizzaIngredientsFactory;
import factory.pizza.*;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new CaliforniaPizzaIngredientsFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientsFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientsFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientsFactory);
                pizza.setName("California Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientsFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
        }

        return pizza;
    }
}
