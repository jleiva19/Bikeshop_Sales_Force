package cl.springlibrary.webapp.repository;

import cl.springlibrary.webapp.compositekeys.StocksId;
import cl.springlibrary.webapp.entity.production.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, StocksId> {
}
