package department;

import clients.Client;
import offer.Offer;

public interface Department {
    void setOffer(Offer offer, int offerCode, int workerId);
    void buyOffer(Offer offer, int offerCode);
    void addClient(Client client);
}
