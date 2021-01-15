package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.entity.sales.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findAllByOrderStatus(Short orderStatus);
    List<Orders> findAllByStoreId(Integer storeId);
}
