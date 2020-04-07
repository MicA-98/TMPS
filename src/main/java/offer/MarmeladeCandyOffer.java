package offer;

public class MarmeladeCandyOffer extends Offer implements CloneableOffer {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CloneableOffer makeCopyOffer() {
        MarmeladeCandyOffer marmeladeCandyOffer = null;
        try {
            marmeladeCandyOffer = (MarmeladeCandyOffer) super.clone();
            marmeladeCandyOffer.setOfferId(Offer.getNewOfferId());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return marmeladeCandyOffer;
    }
}
