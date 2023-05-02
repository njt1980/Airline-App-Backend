package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Booking;
import my.learning.airlineapp.entity.Passenger;
import my.learning.airlineapp.repository.BookingRepository;
import my.learning.airlineapp.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    BookingService bookingService;
    @Override
    public Passenger getPassengerById(Integer id) {
        Optional<Passenger> passenger = passengerRepository.findById(id);
        if(passenger.isPresent()){
            return passenger.get();
        }else{
            System.out.println("Passenger Not Found");
            throw new RuntimeException();
        }
    }
    @Override
    public Passenger createPassenger(Integer bookingId, Passenger passenger) {
        Booking booking = bookingService.getBookingById(bookingId);
        passenger.setBooking(booking);
        passengerRepository.save(passenger);
        return passenger;
   }

    @Override
    public void deletePassenger(Integer Id) {

    }

    @Override
    public List<Passenger> getAllPassengers() {
        return null;
    }
}
