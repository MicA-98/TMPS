package offer;

public class ChocolateCandyOffer extends Offer implements CloneableOffer {
    private String chocolateType;

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    public CloneableOffer makeCopyOffer() {
        ChocolateCandyOffer chocolateCandyOffer = null;
        try {
            chocolateCandyOffer = (ChocolateCandyOffer) super.clone();
            chocolateCandyOffer.setOfferId(Offer.getNewOfferId());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return chocolateCandyOffer;
    }
}
