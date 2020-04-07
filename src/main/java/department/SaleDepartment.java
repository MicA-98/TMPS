package department;

import clients.Client;
import offer.Offer;
import offer.StockOffer;

import java.util.ArrayList;

public class SaleDepartment implements Department {
    private ArrayList<Client> clients;
    private ArrayList<StockOffer> stockOffers;
    private int clientCode;

    public SaleDepartment() {
        this.clients = new ArrayList<Client>();
        this.stockOffers = new ArrayList<StockOffer>();
    }

    public void addClient(Client client) {
        clients.add(client);
        clientCode++;
        client.setClientCode(clientCode);
    }

    public void setOffer(Offer newOffer, int offerCode, int workerId) {
        boolean isInStock = false;
        for (StockOffer offer: stockOffers){
            if (offer.getOffer().getOfferId() == newOffer.getOfferId()){
                System.out.println("Such offer already exists");
                isInStock = true;
                break;
            }
        }
        if (!isInStock){
            StockOffer newStockOffer = new StockOffer(newOffer);
            stockOffers.add(newStockOffer);
            System.out.println("the offer with id: " + newOffer.getOfferId() + " was successfully created");
        }
    }

    public void buyOffer(Offer offer, int offerCode) {
        boolean offerBought = false;
        for (StockOffer stockOffer: stockOffers){
            if (stockOffer.getOffer().getOfferId() == offer.getOfferId()){
                System.out.println("The offer with id: " + stockOffer.getOffer().getOfferId() + " was successfully sold");
                stockOffers.remove(stockOffer);
                offerBought = true;
                break;
            }
        }
        if (!offerBought){
            System.out.println("We cannot find offer with id: " + offer.getOfferId());
        }
    }
    public void getAllOffers() {
        System.out.println("Offers in sell stock");
        for (StockOffer stockOffer : stockOffers) {
            System.out.println("Offer id = " + stockOffer.getOffer().getOfferId() + " offer candy type = " + stockOffer.getOffer().getTypeOfCandy() + " quantity = " + stockOffer.getOffer().getCount());
        }
    }
}
