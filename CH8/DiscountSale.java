package CH8;

public class DiscountSale extends Sale{
    private double discount;

    public DiscountSale(){
        super();
        discount = 0;
    }

    public DiscountSale(String name, double price, double discount){
        super(name, price);
        setDiscount(discount);
    }

    public DiscountSale(DiscountSale originalObject){
        super(originalObject);
        discount = originalObject.discount;
    }

    public double bill(){
        double fraction = discount/100;
        return (1 - fraction) * getPrice();
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double newDiscount){
        if (newDiscount >= 0)
            discount = newDiscount;
        else{
            System.out.println("Error: Negative discount.");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return (getName() + " Price = $" + getPrice()
        + " Discount = " + discount + "%\n"
        + " Total cost = $" + bill());
    }

    public boolean equals(Object otherObject){
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else{ //same class
            DiscountSale otherDiscountSale = (DiscountSale) otherObject;
            return (getName().equals(otherDiscountSale.getName()))
                    && (getPrice() == otherDiscountSale.getDiscount())
                    && (discount == otherDiscountSale.discount);
        }
    }
}
