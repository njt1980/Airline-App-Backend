package my.learning.airlineapp.controller;

import my.learning.airlineapp.entity.Customer;
import my.learning.airlineapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id){
        Customer customer = customerService.getCustomer(id);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }

}
