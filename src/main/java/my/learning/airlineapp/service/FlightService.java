package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Customer;
import my.learning.airlineapp.entity.Flight;

import java.util.List;

public interface FlightService {

    Flight getFlight(Integer id);

    Flight createFlight(Integer id,Flight flight);

    void deleteFlight(Integer Id);

    List<Flight> getAllFlights();
}
