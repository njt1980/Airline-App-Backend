package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Booking;
import my.learning.airlineapp.entity.Passenger;

import java.util.List;

public interface PassengerService {

    Passenger getPassengerById(Integer id);

    Passenger createPassenger(Integer bookingId,Passenger passenger);

    void deletePassenger(Integer Id);

    List<Passenger> getAllPassengers();
}
