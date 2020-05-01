package candy;

public abstract class CandyDecorator implements Candy{
    protected Candy tempCandy;
    public CandyDecorator(Candy newCandy){
        tempCandy = newCandy;
    }
    public String getDescription(){
        return tempCandy.getDescription();
    }

    public double getCost(){
        return tempCandy.getCost();
    }

}
