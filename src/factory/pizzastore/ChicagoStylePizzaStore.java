package factory.pizzastore;

import factory.ingredients.ChicagoPizzaIngredientsFactory;
import factory.ingredients.PizzaIngredientsFactory;
import factory.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory =new ChicagoPizzaIngredientsFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientsFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientsFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientsFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientsFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
        }

        return pizza;
    }
}
