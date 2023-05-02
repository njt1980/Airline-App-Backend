package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomer(Integer id);

    Customer createCustomer(Customer customer);

    void deleteCustomer(Integer Id);

    List<Customer> getAllCustomers();

}
