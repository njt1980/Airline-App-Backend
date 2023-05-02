package my.learning.airlineapp.controller;

import my.learning.airlineapp.entity.Booking;
import my.learning.airlineapp.entity.Passenger;
import my.learning.airlineapp.service.BookingService;
import my.learning.airlineapp.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
@CrossOrigin(origins = "*")
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    @Autowired
    BookingService bookingService;
    @PostMapping("/create/booking/{bookingId}")
    private ResponseEntity<Passenger> createPassenger(@PathVariable Integer bookingId,
                                                      @RequestBody Passenger passenger){
        Passenger passengerCreated = passengerService.createPassenger(bookingId,passenger);
        return new ResponseEntity<>(passengerCreated, HttpStatus.CREATED);
    }

    @GetMapping("/get/booking/{bookingId}")
    private ResponseEntity<List<Passenger>> getPassengersByFlight(@PathVariable Integer bookingId){
        Booking booking = bookingService.getBookingById(bookingId);
        List<Passenger> passengerList = booking.getPassengers();
        return new ResponseEntity<>(passengerList,HttpStatus.FOUND);
    }





}
