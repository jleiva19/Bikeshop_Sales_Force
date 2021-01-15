package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.entity.sales.Stores;

import java.util.List;

public interface StoresService {
    List<Stores> getStores();
    Stores getStore(Integer id);
    void saveStore(Stores store);
    void deleteStore(Integer id);
}
