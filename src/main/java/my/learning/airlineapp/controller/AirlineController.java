package my.learning.airlineapp.controller;

import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airline")
@CrossOrigin(origins = "*")
public class AirlineController {
    @Autowired
    AirlineService airlineService;
    @PostMapping("/create")
    public ResponseEntity<Airline> createAirline(@RequestBody Airline airline){
        airlineService.createAirline(airline);
        return new ResponseEntity<Airline>(airline, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Airline> getAirline(@PathVariable Integer id){
        Airline airline = airlineService.getAirlineById(id);
        return new ResponseEntity<>(airline,HttpStatus.FOUND);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Airline>> getAllAirlines(){
        List<Airline> airlines = airlineService.getAllAirlines();
        return new ResponseEntity<>(airlines,HttpStatus.OK);
    }

}
