package cl.springlibrary.webapp.entity.sales;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@ToString(exclude = {"orderItems","staffs","customer","stores"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "order_id")
    private Integer orderId;
    @Getter
    @Setter
    @Column(name = "customer_id")
    private Integer customerId;
    @Getter
    @Setter
    @Column(name = "order_status")
    private Short orderStatus;
    @Getter
    @Setter
    @Column(name = "order_date")
    private LocalDate orderDate;
    @Getter
    @Setter
    @Column(name = "required_date")
    private LocalDate requiredDate;
    @Getter
    @Setter
    @Column(name = "shipped_date")
    private LocalDate shippedDate;
    @Getter
    @Setter
    @Column(name = "store_id")
    private Integer storeId;
    @Getter
    @Setter
    @Column(name = "staff_id")
    private Integer staffId;

    @OneToOne
    @Getter
    @Setter
    @JoinColumns({
            @JoinColumn(name = "order_id",insertable = false,updatable = false),
            @JoinColumn(name = "item_id",insertable = false,updatable = false)
    })
    private OrderItems orderItems;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "staff_id",insertable = false,updatable = false)
    private Staffs staffs;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "customer_id",insertable = false,updatable = false)
    private Staffs customer;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "store_id",insertable = false,updatable = false)
    private Stores stores;

    public Orders(Integer customerId, Short orderStatus, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, Integer storeId, Integer staffId) {
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.storeId = storeId;
        this.staffId = staffId;
    }
}
