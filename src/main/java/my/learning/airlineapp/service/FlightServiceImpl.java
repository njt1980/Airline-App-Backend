package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.entity.Flight;
import my.learning.airlineapp.repository.AirlineRepository;
import my.learning.airlineapp.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    AirlineService airlineService;
    @Override
    public Flight getFlight(Integer id) {
        Flight flight = flightRepository.findById(id).get();
        return flight;
    }

    @Override
    public Flight createFlight(Integer id, Flight flight) {
        Airline airline = airlineService.getAirlineById(id);
        System.out.println("flight :" + flight);
        flight.setAirline(airline);
        flight.setAvailableSeats(flight.getNumOfSeats() - flight.getReservedSeats());
        flightRepository.save(flight);
        return flight;
    }

    @Override
    public void deleteFlight(Integer Id) {

    }

    @Override
    public List<Flight> getAllFlights() {
        return null;
    }
}
