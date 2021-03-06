package lv.javaguru.java2.database;

import lv.javaguru.java2.domain.Customer;


public interface CustomerDAO {

    Customer save(Customer customer);

    void remove(Customer customer);

    Customer findByPhoneNumber(String phoneNumber);
}
