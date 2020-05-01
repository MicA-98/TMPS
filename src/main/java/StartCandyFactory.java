import candy.Candy;
import candy.MainCandy;
import candy.toppings.Caramel;
import candy.toppings.Chocolate;
import candy.toppings.StrawberryJam;
import clients.Client;
import clients.Metro;
import clients.Nr1;
import clients.Worker;
import conveyer.ChocolateConveyer;
import conveyer.ConveyerChain;
import conveyer.MarmeladeConveyer;
import department.SaleDepartment;
import facade.FactoryInterface;
import offer.ChocolateCandyOffer;
import offer.MarmeladeCandyOffer;
import offer.OfferMaker;
import offer.Signature;

public class StartCandyFactory {
    public static void main(String[] args) {
        OfferMaker offerMaker = new OfferMaker();
        MarmeladeCandyOffer marmeladeCandyOffer = new MarmeladeCandyOffer();
        marmeladeCandyOffer.setOfferId(0);
        marmeladeCandyOffer.setColor("Red");
        marmeladeCandyOffer.setCount(40);
        marmeladeCandyOffer.setSignature(Signature.getInstance().getSign());
        marmeladeCandyOffer.setTypeOfCandy("Marmelade");
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
        Client metro = new Metro(saleDepartment);
        Client nr1 = new Nr1(saleDepartment);
        metro.buyOffer(chocolateCandyOffer);
        metro.buyOffer(marmeladeCandyOffer);
        saleDepartment.getAllOffers();
        saleWorker.setOffer(chocolateCandyOffer);
        saleWorker.setOffer(chocolateCandyOffer);
        saleDepartment.getAllOffers();
        metro.buyOffer(chocolateCandyOffer);
        saleDepartment.getAllOffers();
        saleWorker.setOffer(chocolateCandyOffer);
        saleWorker.setOffer(marmeladeCandyOffer);
        saleDepartment.getAllOffers();
        nr1.buyOffer(marmeladeCandyOffer);
        nr1.buyOffer(chocolateCandyOffer);
        saleDepartment.getAllOffers();
        //----------------------------------------------------------------------------
        ConveyerChain chocolateConveyer = new ChocolateConveyer();
        ConveyerChain marmeladeConveyer = new MarmeladeConveyer();
        chocolateConveyer.setNextConveyer(marmeladeConveyer);
        System.out.println("---------------------------------");
        chocolateConveyer.makeCandy("Marmelade");
        System.out.println("---------------------------------");
        chocolateConveyer.makeCandy("Chocolate");
        System.out.println("---------------------------------");
        chocolateConveyer.makeCandy("Biscuiti");
        System.out.println("---------------------------------");
        marmeladeConveyer.makeCandy("Chocolate");
        //----------------------------------------------------------------------------
        Candy basicCandy = new Chocolate(new Caramel(new StrawberryJam(new Chocolate(new MainCandy()))));
        Candy basicCandy2 = new Chocolate(new Caramel (new MainCandy()));
        System.out.println("Ingredients: " + basicCandy.getDescription());
        System.out.println("Cost: " + basicCandy.getCost());
        System.out.println("Ingredients: " + basicCandy2.getDescription());
        System.out.println("Cost: " + basicCandy2.getCost());
        //----------------------------------------------------------------------------
        saleWorker.setOffer(chocolateCandyOffer);
        saleWorker.setOffer(marmeladeCandyOffer);
        FactoryInterface factoryInterface = new FactoryInterface("admin", "1234");
        factoryInterface.getAllOffers(saleDepartment);
        factoryInterface.buyOffer(saleDepartment, chocolateCandyOffer);
    }
}
