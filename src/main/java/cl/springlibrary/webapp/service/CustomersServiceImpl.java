package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersServiceImpl(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public List<Customers> getCustomers() {
        return customersRepository.findAll();
    }

    @Override
    public Customers getCustomer(Integer id) {
        return customersRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found."));
    }

    @Override
    public void saveCustomer(Customers customer) {
        customersRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customersRepository.deleteById(id);
    }
}
