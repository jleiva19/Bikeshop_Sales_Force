package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.entity.sales.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffsRepository extends JpaRepository <Staffs,Integer> {
}
