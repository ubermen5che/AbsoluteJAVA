package CH4.pizza;

import CH4.pizza.Pizza;

public class PizzaDriverClass {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("large", 1, 1 ,2);

        System.out.println(pizza.getDescription());
    }
}
