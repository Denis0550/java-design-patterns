package builder.example;

public class Pizza {

    private final String name;
    private final int size;

    private final boolean isAddCheese;
    private final boolean isAddSauce;
    private final boolean isTakeaway;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isAddCheese() {
        return isAddCheese;
    }

    public boolean isAddSauce() {
        return isAddSauce;
    }

    public boolean isTakeaway() {
        return isTakeaway;
    }

    @Override
    public String toString() {
        return "Pizza= " + this.getName() + ", Size= " + this.getSize()
                + (this.isAddCheese ? ", add cheese" : "")
                + (this.isAddSauce ? ", add sauce" : "")
                + (this.isTakeaway ? ", takeaway" : "");
    }

    private Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.isAddCheese = builder.isAddCheese;
        this.isAddSauce = builder.isAddSauce;
        this.isTakeaway = builder.isTakeaway;

        System.out.println( "Pizza now: " + this.toString() );
    }

    public static class PizzaBuilder {

        private String name;
        private int size;

        private boolean isAddCheese;
        private boolean isAddSauce;
        private boolean isTakeaway;

        public PizzaBuilder(String name, int size) {

            System.out.println( "PizzaBuilder::construct " + name );
            this.name = name;
            this.size = size;
        }

        public PizzaBuilder addCheese(boolean isAddCheese) {

            System.out.println( "PizzaBuilder::addCheese " +
                    this.getClass().getName() + " is " + isAddCheese );

            this.isAddCheese = isAddCheese;
            return this;
        }

        public PizzaBuilder addSauce(boolean isAddSauce) {

            System.out.println( "PizzaBuilder::addSauce " +
                    this.getClass().getName() + " is " + isAddSauce );

            this.isAddSauce = isAddSauce;
            return this;
        }

        public PizzaBuilder takeaway(boolean isTakeaway) {

            System.out.println( "PizzaBuilder::takeaway " +
                    this.getClass().getName() + " is " + isTakeaway );

            this.isTakeaway = isTakeaway;
            return this;
        }

        public Pizza build() {

            System.out.println( "PizzaBuilder::build " + this.getClass().getName() + " for " + name );
            return new Pizza(this);
        }

    }
}
