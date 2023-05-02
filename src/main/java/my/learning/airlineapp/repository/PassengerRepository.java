package my.learning.airlineapp.repository;

import my.learning.airlineapp.entity.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger,Integer> {
}
