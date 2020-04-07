package clients;

import department.Department;

public class Metro extends Client {
    public Metro(Department newDepartment) {
        super(newDepartment);
        System.out.println("Metro Client Was created");
    }
}
