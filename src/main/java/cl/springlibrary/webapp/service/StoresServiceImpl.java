package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.entity.sales.Stores;
import cl.springlibrary.webapp.repository.StoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoresServiceImpl implements StoresService {

    private final StoresRepository storesRepository;

    public StoresServiceImpl(StoresRepository storesRepository) {
        this.storesRepository = storesRepository;
    }

    @Override
    public List<Stores> getStores() {
        return storesRepository.findAll();
    }

    @Override
    public Stores getStore(Integer id) {
        return storesRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found."));
    }

    @Override
    public void saveStore(Stores store) {
        storesRepository.save(store);
    }

    @Override
    public void deleteStore(Integer id) {
        storesRepository.deleteById(id);
    }
}
