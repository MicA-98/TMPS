package conveyer;

public class ChocolateConveyer implements ConveyerChain {
    private ConveyerChain nextInChain;

    public void setNextConveyer(ConveyerChain nextConveyer) {
        this.nextInChain = nextConveyer;
    }

    public void makeCandy(String typeOfCandy) {
        if (typeOfCandy.equals("Chocolate")) {
            System.out.println("a Chocolate candy was created");
        } else {
            System.out.println("this Chocolate conveyer cannot create such candies");
            try {
                nextInChain.makeCandy(typeOfCandy);
            } catch (Exception e) {
                System.out.println("There is no conveyers that can create such candies");
            }
        }
    }
}
