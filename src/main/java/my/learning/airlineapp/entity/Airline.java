package my.learning.airlineapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Entity
@Table(name = "tblAirlines")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PK_Airlines")
    private int airlineId;
    @NonNull
    @NotBlank(message = "Name cannot be blank")
    private String airlineName;
    @NonNull
    @NotBlank(message = "Airline Code cannot be blank")
    private String airlineCode;
    @NonNull
    @NotBlank(message = "Base Location cannot be blank")
    private String baseLocation;
    @JsonIgnore
    @OneToMany(mappedBy = "airline")
    Set<Flight> flights;
}
