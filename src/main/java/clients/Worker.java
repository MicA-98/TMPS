package clients;

import department.Department;
import offer.Offer;

public class Worker {
    private Department department;
    private int workerId;

    public Worker(Department newDepartment) {
        department = newDepartment;
    }

    public void setOffer(Offer offer) {
        department.setOffer(offer, offer.getOfferId(), this.workerId);
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

}
