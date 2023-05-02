package my.learning.airlineapp.controller;

import jakarta.validation.Valid;
import my.learning.airlineapp.FlightStatus;
import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.entity.Flight;
import my.learning.airlineapp.service.AirlineService;
import my.learning.airlineapp.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flight")
@CrossOrigin(origins = "*")
public class FlightController {
    @Autowired
    FlightService flightService;
    @Autowired
    AirlineService airlineService;
    @PostMapping("/create/airline/{id}")
    private ResponseEntity<Flight> createFlight(@PathVariable Integer id,
                                                @RequestBody Flight flight){
        Flight flight_created = flightService.createFlight(id,flight);

        return new ResponseEntity<>(flight_created, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Flight> getFlight(@PathVariable Integer id){
        Flight flight = flightService.getFlight(id);
        return new ResponseEntity<>(flight,HttpStatus.FOUND);
    }


}
