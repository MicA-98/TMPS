package department;

import clients.Client;
import offer.Offer;

public interface Department {
    public void setOffer(Offer offer, int offerCode, int workerId);
    public void buyOffer(Offer offer, int offerCode);
    public void addClient(Client client);
}
