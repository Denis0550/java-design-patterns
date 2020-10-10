package flyweight.example;

//Instances of Itemwill be the Flyweights
public class Item {
    private final String name;

    public Item(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
