package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Airline;
import my.learning.airlineapp.entity.Booking;

import java.util.List;

public interface BookingService {

    Booking getBookingById(Integer id);

    Booking createBooking(Booking booking, Integer customerId, Integer flightId);

    void deleteBooking(Integer Id);

    List<Booking> getAllBooking();
}
