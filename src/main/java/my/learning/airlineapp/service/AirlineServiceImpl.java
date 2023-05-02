package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService{
    @Autowired
    AirlineRepository airlineRepository;
    @Override
    public Airline getAirlineById(Integer id) {
        Airline airline = airlineRepository.findById(id).get();
        return airline;
    }

    @Override
    public Airline createAirline(Airline airline) {
        Airline saved_airline = airlineRepository.save(airline);
        return saved_airline;
    }

    @Override
    public void deleteAirline(Integer Id) {

    }

    @Override
    public List<Airline> getAllAirlines() {
        return (List<Airline>) airlineRepository.findAll();
    }
}
