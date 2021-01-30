package cl.springlibrary.webapp.compositekeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StocksId implements Serializable {
    @Column(name = "store_id", insertable = false, updatable = false)
    private Integer storeId;
    @Column(name = "product_id", insertable = false, updatable = false)
    private Integer productId;
}
