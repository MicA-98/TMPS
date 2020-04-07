import clients.Metro;
import clients.Nr1;
import clients.Worker;
import conveyer.ChocolateConveyer;
import conveyer.ConveyerChain;
import conveyer.MarmeladeConveyer;
import department.SaleDepartment;
import offer.ChocolateCandyOffer;
import offer.OfferMaker;
import offer.Signature;

public class StartCandyFactory {
    public static void main(String[] args) {
        OfferMaker offerMaker = new OfferMaker();
        ChocolateCandyOffer chocolateCandyOffer = new ChocolateCandyOffer();
        chocolateCandyOffer.setOfferId(0);
        chocolateCandyOffer.setChocolateType("MilkChocolate");
        chocolateCandyOffer.setCount(40);
        chocolateCandyOffer.setSignature(Signature.getInstance().getSign());
        chocolateCandyOffer.setTypeOfCandy("Chocolate");
        ChocolateCandyOffer clonedChocolateCandyOffer = (ChocolateCandyOffer) offerMaker.getClonedOffer(chocolateCandyOffer);
        System.out.println(chocolateCandyOffer.getChocolateType());
        System.out.println(clonedChocolateCandyOffer.getChocolateType());
        System.out.println(clonedChocolateCandyOffer.getSignature());
        //----------------------------------------------------------------------------
        SaleDepartment saleDepartment = new SaleDepartment();
        Worker saleWorker = new Worker(saleDepartment);
        saleWorker.setWorkerId(100);
        Metro metro = new Metro(saleDepartment);
        Nr1 nr1 = new Nr1(saleDepartment);
        metro.buyOffer(chocolateCandyOffer);
        metro.buyOffer(clonedChocolateCandyOffer);
        saleWorker.setOffer(chocolateCandyOffer);
        metro.buyOffer(chocolateCandyOffer);
        saleWorker.setOffer(chocolateCandyOffer);
        saleWorker.setOffer(clonedChocolateCandyOffer);
        saleDepartment.getAllOffers();
        nr1.buyOffer(chocolateCandyOffer);
        //----------------------------------------------------------------------------
        ConveyerChain chocolateConveyer = new ChocolateConveyer();
        ConveyerChain marmeladeConveyer = new MarmeladeConveyer();
        chocolateConveyer.setNextConveyer(marmeladeConveyer);
        chocolateConveyer.makeCandy("Marmelade");
        chocolateConveyer.makeCandy("Chocolate");
        chocolateConveyer.makeCandy("random");
    }
}
