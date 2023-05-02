package my.learning.airlineapp.repository;

import my.learning.airlineapp.entity.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Integer> {
}
