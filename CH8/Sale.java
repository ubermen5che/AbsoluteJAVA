package CH8;

public class Sale {

    private String name; //A nonempty string
    private double price; //nonnegative

    public Sale() {
        name = "No name yet";
        price = 0;
    }

    /**
     * Precondition: theName is a nonempty string; thePrice is nonnegative.
     */
    public Sale(String theName, double thePrice) {
        setName(theName);
        setPrice(thePrice);
    }

    public Sale(Sale originalObject) {
        if (originalObject == null) {
            System.out.println("Error: null sale object.");
            System.exit(0);
        }

        name = originalObject.name;
        price = originalObject.price;
    }

    public static void announcement() {
        System.out.println("This is the Sale class");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && newName != "")
            name = newName;
        else {
            System.out.println("Error: Improper name value.");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Sale{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0)
            price = newPrice;
        else {
            System.out.println("Error: Negative price.");
            System.exit(0);
        }
    }

    public double bill() {
        return price;
    }

    public boolean equalsDeals(Sale otherSale){
        if (otherSale == null)
            return false;
        else
            return (name.equals(otherSale.name)
            && bill() == otherSale.bill());
    }

    public boolean lessThan(Sale otherSale){
        if (otherSale == null){
            System.out.println("Error: null Sale object.");
            System.exit(0);
        }

        return (bill() < otherSale.bill());
    }

    public boolean equals(Object otherObject){
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else{
            Sale otherSale = (Sale)otherObject;
            return (name.equals(otherSale.name))
                    && (price == otherSale.price);
        }
    }
}
