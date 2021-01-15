package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.dto.OrdersDto;
import cl.springlibrary.webapp.entity.sales.Orders;
import cl.springlibrary.webapp.mapper.OrdersMapper;
import cl.springlibrary.webapp.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersMapper ordersMapper;
    private final OrdersRepository ordersRepository;

    public OrdersServiceImpl(OrdersMapper ordersMapper, OrdersRepository ordersRepository) {
        this.ordersMapper = ordersMapper;
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDto> getOrders() {
        return ordersRepository.findAll()
            .stream()
                .map(ordersMapper::entityToDto)
                .collect(Collectors.toList()); }

    @Override
    public Orders getOrder(Integer id) {
        return ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found."));
    }

    @Override
    public void saveOrder(Orders order) {
        ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(Integer id) {
        ordersRepository.deleteById(id);
    }
}
