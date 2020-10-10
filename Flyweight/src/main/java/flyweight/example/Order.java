package flyweight.example;

public class Order {
    private final int ordernumber;
    private final Item item;

    Order(int ordernumber, Item item) {
        this.ordernumber = ordernumber;
        this.item = item;
    }

    void processOrder(){
        System.out.println("Ordering " + item + " for order number: " + ordernumber);
    }
}
