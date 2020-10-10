package abstractfactory;

import abstractfactory.example.factories.PizzaFactory;

public class AbstractFactory {

    public static void main(String[] args) {

        try {

            System.out.println( PizzaFactory.createPizza("Margharita", 32) );
            System.out.println( PizzaFactory.createPizza("Capriciosa", 42) );

            try {
                System.out.println(PizzaFactory.createPizza("Nonesuch", 21));
            } catch ( Exception e ) {

                e.printStackTrace();
                System.err.println( e.getMessage() );

            }

            System.out.println( PizzaFactory.createPizza("Frutti di Mare", 32) );

        } catch ( IllegalArgumentException e ) {

            System.err.println( "Pizza type error: " + e.getMessage() );
        }

    }
}
