package src.test;

import src.domain.Customer;

public class CustomerTest {
    public static void main(String[] args){
        Customer myCustomer = new Customer(3, true, 3.5);
        myCustomer.displayCustomerInfo();
        myCustomer.setID(2);
        myCustomer.setNew(false);
        myCustomer.setTotal(2.5);
        myCustomer.displayCustomerInfo();

    }
}
