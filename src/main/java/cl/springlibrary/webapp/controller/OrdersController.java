package cl.springlibrary.webapp.controller;

import cl.springlibrary.webapp.entity.sales.Orders;
import cl.springlibrary.webapp.service.CustomersService;
import cl.springlibrary.webapp.service.OrdersService;
import cl.springlibrary.webapp.service.StoresService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;
    private final StoresService storesService;

    public OrdersController(OrdersService ordersService, StoresService storesService) {
        this.ordersService = ordersService;
        this.storesService = storesService;
    }

    @GetMapping("/list")
    public String getOrders(Model model) {
        model.addAttribute("orders", ordersService.getOrders());
        model.addAttribute("stores",storesService.getStores());
        return "orders/orders-list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Orders order = new Orders();
        model.addAttribute("order", order);

        return "orders/orders-add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("order") Orders order) {
        ordersService.saveOrder(order);
        return "redirect:/orders/orders-list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("orderId") Integer id, Model model) {
        Orders order = ordersService.getOrder(id);
        model.addAttribute("order", order);
        return "orders/orders-add";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("orderId") Integer id) {
        ordersService.deleteOrder(id);
        return "redirect:/orders/orders-list";
    }

}


