package candy.toppings;

import candy.Candy;
import candy.CandyDecorator;

public class StrawberryJam extends CandyDecorator {

    public StrawberryJam(Candy newCandy) {
        super(newCandy);
        System.out.println(" Adding Strawberry Jam ");
    }

    public String getDescription() {
        return tempCandy.getDescription() + ", Strawberry Jam";
    }

    public double getCost() {
        return tempCandy.getCost() + 2;
    }
}
