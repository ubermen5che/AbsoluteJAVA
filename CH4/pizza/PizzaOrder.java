package CH4.pizza;

public class PizzaOrder {

    private int numPizza;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public void setNumPizzas(int numPizzas){
        this.numPizza = numPizzas;
    }

    public void setPizza1(Pizza pizza1){
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2){
        this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3){
        this.pizza3 = pizza3;
    }

    public double calcTotal(){
        if(numPizza == 0)
            return 0.0;
        else if(numPizza == 1)
            return pizza1.calcCost();
        else if(numPizza == 2)
            return pizza1.calcCost() + pizza2.calcCost();
        else
            return pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
    }
}
