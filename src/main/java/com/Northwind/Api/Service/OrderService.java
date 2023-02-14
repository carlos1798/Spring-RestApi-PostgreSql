package com.Northwind.Api.Service;


import com.Northwind.Api.Dto.CustomerResponse;
import com.Northwind.Api.Dto.OrderResponse;
import com.Northwind.Api.Model.Order;
import com.Northwind.Api.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> allOrders(){
        List<Order> orderList = repository.findAll();
        return orderList;
    }

    public  Order getOrder(int id){
        return repository.findById(id);

    }
    private OrderResponse mapToOrderResponse(Order order){
        return new OrderResponse(
                order.getCostumer().getContact_name(),
                order.getEmployee(),
                order.getOrder_date(),
                order.getRequired_date(),
                order.getShipped_date(),
                order.getFreight(),
                order.getShip_name(),
                order.getShip_address(),
                order.getShip_city(),
                order.getShip_region(),
                order.getShip_postal_code(),
                order.getShip_country()
                );


    }

}
