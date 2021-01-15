package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.sales.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Integer> {
}
