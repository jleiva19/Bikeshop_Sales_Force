package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.sales.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoresRepository extends JpaRepository<Stores, Integer> {
}
