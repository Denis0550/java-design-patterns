package fluentinterface;

import fluentinterface.example.RestaurantImpl;
import java.util.Arrays;
import java.util.List;

public class FluentInterface {

    public static void main(String[] args) {

        final Integer[] myChoice = new Integer[]{1, 3};
        final List myOrder = Arrays.asList( myChoice );

        new RestaurantImpl()
                .name("Primavera")
                .getMenu()
                .orderPizza( myOrder )
                .eatPizza()
                .payPizza();

        new RestaurantImpl()
                .name("Raw raw green")
                .getVeganMenu()
                .orderPizza( Arrays.asList( new Integer[]{1} ) )
                .eatPizza()
                .payPizza();
    }

}