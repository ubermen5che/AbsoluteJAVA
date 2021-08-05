package CH4.pizza;

public class Pizza {

    private static final int smallBasicCost = 10;
    private static final int mediumBasicCost = 12;
    private static final int largeBasicCost = 14;

    //small, medium, large
    private String size;
    private int cheeseTopping;
    private int pepTopping;
    private int hamTopping;

    public Pizza(String size, int cheeseTopping, int pepTopping, int hamTopping){
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepTopping = pepTopping;
        this.hamTopping = hamTopping;
    }

    public double calcCost(){
        if(size.equals("small")){
            return smallBasicCost + 2*(cheeseTopping+pepTopping+hamTopping);
        }else if(size.equals("medium")){
            return mediumBasicCost + 2*(cheeseTopping+pepTopping+hamTopping);
        }else {
            return largeBasicCost + 2 * (cheeseTopping + pepTopping + hamTopping);
        }
    }

    public String getDescription(){
        return ("size: " + size + " cheese topping: " + cheeseTopping + " pepperoni topping: " + pepTopping
        + " ham topping: " + hamTopping + " total cost: " + calcCost());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepTopping() {
        return pepTopping;
    }

    public void setPepTopping(int pepTopping) {
        this.pepTopping = pepTopping;
    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }
}
