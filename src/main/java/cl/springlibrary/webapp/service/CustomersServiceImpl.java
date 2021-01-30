package cl.springlibrary.webapp.service;

import cl.springlibrary.webapp.dto.CustomersDto;
import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.mapper.CustomersMapper;
import cl.springlibrary.webapp.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;
    private final CustomersMapper customersMapper;

    public CustomersServiceImpl(CustomersRepository customersRepository, CustomersMapper customersMapper) {
        this.customersRepository = customersRepository;
        this.customersMapper = customersMapper;
    }

    @Override
    public List<CustomersDto> getCustomers() {
        return customersRepository.findAll()
                .stream()
                .map(customersMapper::entityToDto)
                .collect(Collectors.toList());
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
