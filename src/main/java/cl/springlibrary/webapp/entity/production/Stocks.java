package cl.springlibrary.webapp.entity.production;

import cl.springlibrary.webapp.compositekeys.StocksId;
import cl.springlibrary.webapp.entity.sales.Stores;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
@ToString(exclude ={"products","stores"})
@IdClass(StocksId.class)
@Table(name = "stocks")
public class Stocks {
    @Id
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @Column(name = "store_id")
    private Integer storeId;
    @Id
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @Column(name = "product_id")
    private Integer productId;
    @Getter
    @Setter
    @Column(name = "quantity")
    private Integer quantity;
    @Getter
    @Setter
    @OneToOne(mappedBy = "stocks")
    private Products products;
    @Getter
    @Setter
    @OneToOne(mappedBy = "stocks")
    private Stores stores;

    public Stocks(Integer quantity) {
        this.quantity = quantity;
    }
}
