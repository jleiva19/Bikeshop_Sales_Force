package cl.springlibrary.webapp.entity.sales;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"store","manager","subordinates"})
@NoArgsConstructor
@Entity
@Table(name = "staffs")
public class Staffs {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "staff_id")
    private Integer staffId;
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
    @Column(name = "email")
    private String email;
    @Getter
    @Setter
    @Column(name = "phone")
    private String phone;
    @Getter
    @Setter
    @Column(name = "active")
    private Short active;
    @Getter
    @Setter
    @Column(name = "store_id")
    private Integer storeId;
    @Getter
    @Setter
    @Column(name = "manager_id")
    private Integer managerId;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "manager_id",insertable = false,updatable = false)
    private Staffs manager;

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Staffs> subordinates;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "store_id",insertable = false,updatable = false)
    private Stores store;

    public Staffs(String firstName, String lastName, String email, String phone, Short active, Integer storeId, Integer managerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.active = active;
        this.storeId = storeId;
        this.managerId = managerId;
    }
}
