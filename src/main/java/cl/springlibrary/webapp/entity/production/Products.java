package cl.springlibrary.webapp.entity.production;

import cl.springlibrary.webapp.entity.sales.OrderItems;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString(exclude = {"stocks", "categories","brands"})
@Entity
@Table(name = "products")
public class Products {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "product_id")
    private Integer productId;
    @Getter
    @Setter
    @Column(name = "product_name")
    private String productName;
    @Getter
    @Setter
    @Column(name = "brand_id")
    private Integer brandId;
    @Getter
    @Setter
    @Column(name = "category_id")
    private Integer categoryId;
    @Getter
    @Setter
    @Column(name = "model_year")
    private Short modelYear;
    @Getter
    @Setter
    @Column(name = "list_price")
    private BigDecimal listPrice;

    @OneToOne
    @Getter
    @Setter
    @JoinColumns({
            @JoinColumn(name = "store_id", insertable = false, updatable = false),
            @JoinColumn(name = "product_id", insertable = false, updatable = false)
    })
    private Stocks stocks;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "category_id",insertable = false,updatable = false)
    private Categories categories;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "brand_id",insertable = false,updatable = false)
    private Brands brands;

    public Products(String productName, Integer brandId, Integer categoryId, Short modelYear, BigDecimal listPrice) {
        this.productName = productName;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.modelYear = modelYear;
        this.listPrice = listPrice;
    }
}
