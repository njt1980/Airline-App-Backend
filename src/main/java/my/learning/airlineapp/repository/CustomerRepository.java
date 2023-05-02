package my.learning.airlineapp.repository;

import my.learning.airlineapp.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
