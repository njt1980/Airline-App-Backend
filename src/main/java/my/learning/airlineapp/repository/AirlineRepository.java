package my.learning.airlineapp.repository;

import my.learning.airlineapp.entity.Airline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends CrudRepository<Airline,Integer> {
}
