package clients;

import department.Department;
import offer.Offer;

public abstract class Client {
    private Department department;
    private int clientCode;


    public Client(Department newDepartment){
        department = newDepartment;

        department.addClient(this);

    }

    public void buyOffer(Offer offer){

        department.buyOffer(offer, this.clientCode);

    }

    public void setClientCode(int clientCode){ this.clientCode = clientCode; }
}
