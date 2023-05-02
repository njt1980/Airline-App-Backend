package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Customer;
import my.learning.airlineapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer getCustomer(Integer id) {
        Customer customer = customerRepository.findById(id).get();
        return customer;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Integer Id) {

    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = (List<Customer>) customerRepository.findAll();
        return customers;
    }
}
