package cl.springlibrary.webapp.compositekeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItemsId implements Serializable {
    @Column(name = "order_id", insertable = false, updatable = false)
    private Integer orderId;
    @Column(name = "item_id", insertable = false, updatable = false)
    private Integer itemId;
}
