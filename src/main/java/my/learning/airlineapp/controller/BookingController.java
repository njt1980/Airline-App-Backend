package my.learning.airlineapp.controller;

import my.learning.airlineapp.entity.Booking;
import my.learning.airlineapp.entity.Flight;
import my.learning.airlineapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "*")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("/create/airline/{flightId}/customer/{customerId}")
    private ResponseEntity<Booking> createBooking(@PathVariable Integer flightId,
                                                @PathVariable Integer customerId,
                                                @RequestBody Booking booking){
        Booking booking_created = bookingService.createBooking(booking,
                                                              customerId,
                                                              flightId);
        return new ResponseEntity<>(booking_created, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    private ResponseEntity<Booking> getBooking(@PathVariable Integer id){
        Booking booking = bookingService.getBookingById(id);
        return new ResponseEntity<>(booking,HttpStatus.FOUND);
    }
}
