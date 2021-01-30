package cl.springlibrary.webapp.entity.sales;

import cl.springlibrary.webapp.compositekeys.OrderItemsId;
import cl.springlibrary.webapp.entity.production.Products;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
@Table(name = "order_items")
@ToString(exclude = {"order","products"})
@IdClass(OrderItemsId.class)
public class OrderItems {

    @EqualsAndHashCode.Include
    @Getter
    @Setter
    @Id
    @Column(name = "order_id")
    private Integer orderId;
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    @Id
    @Column(name = "item_id")
    private Integer itemId;
    @Getter
    @Setter
    @Column(name = "product_id")
    private Integer productId;
    @Getter
    @Setter
    @Column(name = "quantity")
    private Integer quantity;
    @Getter
    @Setter
    @Column(name = "list_price")
    private BigDecimal listPrice;
    @Getter
    @Setter
    @Column(name = "discount")
    private BigDecimal discount;

    @Getter
    @Setter
    @OneToOne(mappedBy = "orderItems")
    private Orders order;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "product_id",insertable = false,updatable = false)
    private Products products;

    public OrderItems(Integer productId, Integer quantity, BigDecimal listPrice, BigDecimal discount) {
        this.productId = productId;
        this.quantity = quantity;
        this.listPrice = listPrice;
        this.discount = discount;
    }
}
