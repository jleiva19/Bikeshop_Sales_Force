package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.sales.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository <OrderItems,Integer> {
}
