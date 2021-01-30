package cl.springlibrary.webapp.mapper;

import cl.springlibrary.webapp.dto.OrdersDto;
import cl.springlibrary.webapp.entity.sales.Orders;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper {

    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);

    @Mappings({
            @Mapping(target = "orderId", source = "orderId"),
            @Mapping(target = "staffFirstName", expression = "java(order.getStaffs().getFirstName())"),
            @Mapping(target = "staffLastName", expression = "java(order.getStaffs().getLastName())"),
            @Mapping(target = "clientFirstName", expression = "java(order.getCustomer().getFirstName())"),
            @Mapping(target = "clientLastName", expression = "java(order.getCustomer().getLastName())"),
            @Mapping(target = "orderDate", source = "orderDate"),
            @Mapping(target = "requiredDate", source = "requiredDate"),
            @Mapping(target = "orderStatus", source = "orderStatus")
    })
    OrdersDto entityToDto(Orders order);
}





