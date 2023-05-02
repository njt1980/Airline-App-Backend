package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Airline;

import java.util.List;

public interface AirlineService {

    Airline getAirlineById(Integer id);

    Airline createAirline(Airline airline);

    void deleteAirline(Integer Id);

    List<Airline> getAllAirlines();


}
