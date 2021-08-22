package CH8;

public class LateBindingDemo {

    public static void main(String[] args) {
        Sale simple = new Sale("floor mat", 10.00);
        DiscountSale discountSale = new DiscountSale("floor mat", 11.00, 10);
        System.out.println(simple);
        System.out.println(discountSale);

        if (discountSale.lessThan(simple))
            System.out.println("Discounted item is cheaper");
        else
            System.out.println("Discounted item is not cheaper");

        Sale regularPrice = new Sale("cup holder", 9.90);
        DiscountSale specialPrice = new DiscountSale("cup holder", 11.00, 10);
        System.out.println(regularPrice);
        System.out.println(specialPrice);

        if (specialPrice.equalsDeals(regularPrice))
            System.out.println("Deals are equal.");
        else
            System.out.println("Deals are not equal.");
    }
}
