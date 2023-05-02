package my.learning.airlineapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblBookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Bookings")
    private Integer id;
    private String bookingCode;
    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id",referencedColumnName = "PK_Customers")
    private Customer customer;
    @ManyToOne(optional = false)
    @JoinColumn(name = "flight_id",referencedColumnName = "PK_Flights")
    private Flight flight;
    @JsonIgnore
    @OneToMany(mappedBy = "booking")
    List<Passenger> passengers;
}
