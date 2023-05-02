package my.learning.airlineapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import my.learning.airlineapp.FlightStatus;
import org.hibernate.annotations.Formula;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name="tblFlights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Flights")
    private int flightId;
    @NotBlank(message = "Flight Code cannot be blank")
    private String flightCode;
    @NotBlank(message = "Origin cannot be blank")
    private String origin;
    @NotBlank(message = "Destination cannot be blank")
    private String destination;
    private int numOfSeats;
    private int reservedSeats;
    @Formula(value = "(NUM_OF_SEATS - RESERVED_SEATS)::numeric")
    @Column(name = "AVAILABLE_SEATS")
    private int availableSeats;
//    public int getAvailableSeats(){
//        return availableSeats;
//    };
    @Formula("AVAILABLE_SEATS <= 0")
    @Column(name = "FULLY_BOOKED")
    private boolean fullyBooked;
    @Enumerated(EnumType.STRING)
    private FlightStatus flightStatus;
    @ManyToOne(optional = false,
               cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Flights_Airlines",referencedColumnName = "PK_Airlines")
    private Airline airline;

//    @PostLoad
//    private void onLoad(){
//        this.availableSeats = this.numOfSeats - this.reservedSeats;
//    }
}
