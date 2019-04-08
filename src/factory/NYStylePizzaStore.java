package factory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
