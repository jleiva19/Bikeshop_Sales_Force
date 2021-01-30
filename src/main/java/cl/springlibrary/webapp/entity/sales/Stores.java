package cl.springlibrary.webapp.entity.sales;

import cl.springlibrary.webapp.entity.production.Stocks;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "stocks")
@NoArgsConstructor
@Entity
@Table(name = "stores")
public class Stores {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "store_id")
    private Integer storeId;
    @Getter
    @Setter
    @Column(name = "store_name")
    private String storeName;
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

    @Getter
    @Setter
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "store_id", insertable = false, updatable = false),
            @JoinColumn(name = "product_id", insertable = false, updatable = false)
    })
    private Stocks stocks;


    public Stores(String storeName, String phone, String email, String street, String city, String state, String zipCode) {
        this.storeName = storeName;
        this.phone = phone;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
