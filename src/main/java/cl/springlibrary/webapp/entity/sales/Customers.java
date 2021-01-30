package cl.springlibrary.webapp.entity.sales;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    @Column(name = "customer_id")
    private Integer customerId;
    @Getter
    @Setter
    @Column(name = "first_name")
    private String firstName;
    @Getter
    @Setter
    @Column(name = "last_name")
    private String lastName;
    @Getter
    @Setter
    @Column(name = "phone")
    private String phone;
    @Getter
    @Setter
    @Column(name = "email")
    private String email;
    @Getter
    @Setter
    @Column(name = "street")
    private String street;
    @Getter
    @Setter
    @Column(name = "city")
    private String city;
    @Getter
    @Setter
    @Column(name = "state")
    private String state;
    @Getter
    @Setter
    @Column(name = "zip_code")
    private String zipCode;

    public Customers(String firstName, String lastName, String phone, String email, String street, String city, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
