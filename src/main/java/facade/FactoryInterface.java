package facade;

import department.SaleDepartment;
import offer.Offer;

public class FactoryInterface {
    Welcome welcome;
    private String login = "admin";
    private String pass = "1234";
    private boolean isLogged = false;

    public FactoryInterface(String login, String pass) {
        if (this.login.equals(login) && this.pass.equals(pass)) {
            welcome = new Welcome();
            isLogged = true;
        } else {
            System.out.println("Incorrect Data!!!");
        }
    }

    public void getAllOffers(SaleDepartment department) {
        if (isLogged) {
            department.getAllOffers();
        } else System.out.println("Login First");
    }

    public void buyOffer(SaleDepartment department, Offer offer) {
        if (isLogged) {
            department.buyOffer(offer, offer.getOfferId());
        } else System.out.println("Login First");
    }
}
