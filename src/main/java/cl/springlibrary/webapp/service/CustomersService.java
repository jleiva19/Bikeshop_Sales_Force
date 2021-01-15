package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.entity.sales.Customers;

import java.util.List;

public interface CustomersService {
    List<Customers> getCustomers();
    Customers getCustomer(Integer id);
    void deleteCustomer(Integer id);
    void saveCustomer(Customers customer);
}
