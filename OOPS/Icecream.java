package OOPS;

public class Icecream extends DessertItem{
    private int numberOfScoops;
    private double pricePerScoop;
    private double toppingPrice;

    public Icecream() {
        super();
        numberOfScoops = 0;
        pricePerScoop = 0;
        toppingPrice = 0;

    }

    public Icecream(String name, int scoops, double prcPerScoop, double toppings)
    {
        super(name);
        numberOfScoops = scoops;
        pricePerScoop = prcPerScoop;
        toppingPrice = toppings;
    }


    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double getCost() {
        double total = (numberOfScoops * pricePerScoop + toppingPrice);
        return Math.round(100 * total );
    }

    public String toString()
    {
        String s = String.format("%-50s $%.2f\n\t %d scoops @ $%.2f/scoop + $%.2f", getName(), getCost()/100, numberOfScoops, pricePerScoop, toppingPrice);
        return s;
    }
}
