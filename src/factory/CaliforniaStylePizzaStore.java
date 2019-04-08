package factory;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new CaliforniaStylePepperoniPizza();
                break;
            case "clam":
                pizza = new CaliforniaStyleClamPizza();
                break;
            case "veggie":
                pizza = new CaliforniaStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
