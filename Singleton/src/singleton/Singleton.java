package singleton;

import singleton.example.Pizza;
import singleton.exercise.Animal;

public class Singleton {

    public static void main(String[] args) {
        Pizza margharita = Pizza.getInstance();
        margharita.name = "Margharita";
        Pizza capriciosa = Pizza.getInstance();
        capriciosa.name = "Capriciosa";
        Pizza fruttidimare = Pizza.getInstance();
        fruttidimare.name = "Frutti di mare";

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttidimare);

//        Animal dog = Animal.getInstance();
//        Animal cat = Animal.getInstance();
//        cat.type = "Cat";
//        Animal duck = Animal.getInstance();
//        duck.type = "Duck";
//
//        System.out.println(dog);
//        System.out.println(cat);
//        System.out.println(duck);
    }
}