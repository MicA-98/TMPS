package offer;

public abstract class Offer {
    private String signature;
    private Integer count;
    private String typeOfCandy;
    private int offerId;
    private static int newOfferId = 0;

    private static void incrementOfferId(){
        newOfferId++;
    }

    public static int getNewOfferId(){
        return newOfferId;
    }

    public int getOfferId(){
        return this.offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = getNewOfferId();
        incrementOfferId();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTypeOfCandy() {
        return typeOfCandy;
    }

    public void setTypeOfCandy(String typeOfCandy) {
        this.typeOfCandy = typeOfCandy;
    }
}
