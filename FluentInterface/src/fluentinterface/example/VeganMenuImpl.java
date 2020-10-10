package fluentinterface.example;

import java.util.List;

public class VeganMenuImpl extends MenuImpl {

    public VeganMenuImpl() {

        // Reuse collection
        menuList.clear();

        Pizza veggie = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("1. Veggie choice ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Garlic Souce, Carrots, Spinach)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 7;
            }
        };

        Pizza margharita = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("2. Margharita ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Tomato Souce, Cheese)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 10;
            }
        };

        Pizza fruttidimare = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("3. Frutti di Mare ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Tomato Souce, Chees, Seafood)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 20;
            }
        };

        menuList.add(veggie);
        menuList.add(margharita);
        menuList.add(fruttidimare);

    }

    @Override
    public Menu orderPizza(List<Integer> orders) {
        System.out.println("Vegan Order pizza:");
        for (Integer index : orders) {
            Pizza pizza = menuList.get(index - 1);
            selectedList.add(pizza);
            pizza.getName().getIngredients();
        }
        return this;
    }

}
