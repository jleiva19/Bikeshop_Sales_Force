package cl.springlibrary.webapp.restcontroller;

import cl.springlibrary.webapp.dto.OrdersDto;
import cl.springlibrary.webapp.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrdersRestController {
    private final OrdersService ordersService;

    public OrdersRestController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/orders")
    public List<OrdersDto> getOrders() {
        return ordersService.getOrders();
    }
}
