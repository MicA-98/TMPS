package candy.toppings;

import candy.Candy;
import candy.CandyDecorator;

public class Caramel extends CandyDecorator {
    public Caramel(Candy newCandy) {
        super(newCandy);
        System.out.println(" Adding Caramel ");
    }
    public String getDescription() {
        return tempCandy.getDescription() + ", Caramel";
    }

    public double getCost() {
        return tempCandy.getCost() + 1.00;
    }
}
