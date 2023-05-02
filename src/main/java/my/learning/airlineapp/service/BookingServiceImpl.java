package my.learning.airlineapp.service;

import my.learning.airlineapp.entity.Booking;
import my.learning.airlineapp.entity.Customer;
import my.learning.airlineapp.entity.Flight;
import my.learning.airlineapp.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService{
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerService customerService;
    @Autowired
    FlightService flightService;
    @Override
    public Booking getBookingById(Integer id) {
        Booking booking = bookingRepository.findById(id).get();
        return booking;
    }
    @Override
    public Booking createBooking(Booking booking, Integer customerId, Integer flightId) {
        Customer customer = customerService.getCustomer(customerId);
        Flight flight = flightService.getFlight(flightId);
        booking.setFlight(flight);
        booking.setCustomer(customer);
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public void deleteBooking(Integer Id) {

    }

    @Override
    public List<Booking> getAllBooking() {
        return null;
    }
}
