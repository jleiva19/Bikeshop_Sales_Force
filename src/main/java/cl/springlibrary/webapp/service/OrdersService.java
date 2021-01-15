package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.dto.OrdersDto;
import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.entity.sales.Orders;

import java.util.List;

public interface OrdersService {
    List<OrdersDto> getOrders();
    Orders getOrder(Integer id);
    void saveOrder(Orders customer);
    void deleteOrder(Integer id);
}
