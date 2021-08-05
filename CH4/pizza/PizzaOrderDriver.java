package CH4.pizza;

public class PizzaOrderDriver {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
        
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        double total = order.calcTotal();

        System.out.println("total = " + total);
    }
}
