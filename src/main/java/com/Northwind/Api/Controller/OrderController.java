package com.Northwind.Api.Controller;

import com.Northwind.Api.Dto.OrderResponse;
import com.Northwind.Api.Model.Order;
import com.Northwind.Api.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping()
    public List<Order> getAllOrders(){
        return service.allOrders();
    }

    @GetMapping("/{order_id}")
    public Order getOrder(@PathVariable("order_id") int order_id){
        return service.getOrder(order_id);
    }




}
