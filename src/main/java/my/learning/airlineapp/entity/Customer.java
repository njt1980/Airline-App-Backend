package my.learning.airlineapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
//@RequiredArgsConstructor
@Entity
@Table(name = "tblCustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Customers")
    private int customerId;
    @NonNull
    @NotBlank(message = "First Name cannot be blank")
    private String firstName;
    @NonNull
    @NotBlank(message = "First Name cannot be blank")
    private String lastName;
    @NonNull
    @Past(message = "Birth Date cannot be in the future")
    private LocalDate birthDate;

}
