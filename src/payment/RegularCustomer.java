package payment;

import java.util.ArrayList;

public class RegularCustomer extends Customer {

    //constructor
    public RegularCustomer(String name) {
        super(name);
        this.paymentHistory = new ArrayList<>();
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println( name + "is" + " " + "Regular Customer");
    }
}
