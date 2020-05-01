package candy.toppings;

import candy.Candy;
import candy.CandyDecorator;

public class Chocolate extends CandyDecorator {
    public Chocolate(Candy newCandy) {
        super(newCandy);
        System.out.println(" Adding chocolate ");
    }

    public String getDescription() {
        return tempCandy.getDescription() + ", Chocolate";
    }

    public double getCost() {
        return tempCandy.getCost() + .50;
    }
}
