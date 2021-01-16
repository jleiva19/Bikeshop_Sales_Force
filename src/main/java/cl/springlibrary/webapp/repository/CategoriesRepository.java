package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.production.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
