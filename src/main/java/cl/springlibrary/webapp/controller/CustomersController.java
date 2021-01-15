package cl.springlibrary.webapp.controller;

import cl.springlibrary.webapp.entity.sales.Customers;
import cl.springlibrary.webapp.service.CustomersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersService customersService;

    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @GetMapping("/list")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customersService.getCustomers());
        return "customers/customer-list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Customers customer = new Customers();
        model.addAttribute("customer", customer);
        return "customers/customer-add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customers customer) {
        customersService.saveCustomer(customer);
        return "redirect:/customers/customer-list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("customerId") Integer id, Model model) {
        Customers customer = customersService.getCustomer(id);
        model.addAttribute("customer", customer);
        return "customers/customer-add";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("customerId") Integer id) {
        customersService.deleteCustomer(id);
        return "redirect:/customers/customer-list";
    }

}
