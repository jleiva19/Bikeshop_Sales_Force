package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.production.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands, Integer> {
}
