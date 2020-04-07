package conveyer;

public interface ConveyerChain {
    public void setNextConveyer(ConveyerChain nextConveyer);
    public void makeCandy(String typeOfCandy);
}
