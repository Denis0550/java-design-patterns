package abstractfactory.example.factories;

import abstractfactory.example.pizza.Pizza;
import abstractfactory.exercise.factories.FruttiDiMareFactory;

public class PizzaFactory {

    public static Pizza createPizza(String type, int size) throws IllegalArgumentException {
        Pizza pizza;
        switch (type) {
            case "Margharita":
                pizza = new MargharitaFactory().create(size);
                break;
            case "Capriciosa":
                pizza = new CapriciosaFactory().create(size);
                break;
            case "Frutti di Mare":
                pizza = new FruttiDiMareFactory().create(size);
                break;

            // TODO Exception: pizza cannot be identified. (homework)
            default:
                throw new IllegalArgumentException(
                        String.format( "Pizza type \'%s\' is not supported." , type ) );
        }

        return pizza;
    }
}
