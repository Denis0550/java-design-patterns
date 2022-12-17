package observer.example;

import observer.exercise.Animal;

public interface ShoppingCart {

    int visit(Car car);

    int visit(Computer computer);

    int visit(Animal animal);
}