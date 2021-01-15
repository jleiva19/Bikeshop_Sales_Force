package cl.springlibrary.webapp.restcontroller;

import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.service.CustomersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiC")
public class CustomersRestController {
    private final CustomersService customersService;

    public CustomersRestController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @GetMapping("/customers")
    public List<Customers> getCustomers() {
        return customersService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customers getCustomer(@PathVariable int customerId) {
        return customersService.getCustomer(customerId);
    }

    @PostMapping("/customers")
    public Customers addCustomer(@RequestBody Customers customer) {
        customer.setCustomerId(0);
        customersService.saveCustomer(customer);
        return customer;
    }

    @PutMapping("/customers")
    public Customers updateCustomer(@RequestBody Customers customer) {
        customersService.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        customersService.deleteCustomer(customerId);
        return "Deleted Customer with ID of " + customerId;
    }
}
