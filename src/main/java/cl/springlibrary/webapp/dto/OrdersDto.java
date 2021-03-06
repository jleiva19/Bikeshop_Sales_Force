package cl.springlibrary.webapp.dto;

import cl.springlibrary.webapp.entity.sales.Orders;
import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrdersDto {
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    private Integer orderId;
    @Getter
    @Setter
    private String  staffFirstName;
    @Getter
    @Setter
    private String  staffLastName;
    @Getter
    @Setter
    private String clientFirstName;
    @Getter
    @Setter
    private String clientLastName;
    @Getter
    @Setter
    private LocalDate orderDate;
    @Getter
    @Setter
    private LocalDate requiredDate;
    @Getter
    @Setter
    private String orderStatus;
}
