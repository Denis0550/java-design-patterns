package observer.example;

public interface Item {

    public int accept(ShoppingCart visitor);
}