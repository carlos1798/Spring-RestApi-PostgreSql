package com.Northwind.Api.Repository;

import com.Northwind.Api.Dto.OrderResponse;
import com.Northwind.Api.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

public Order findById(int order_id);
    //public Optional<List<OrderResponse>> findByCustomer(String id_costumer);
}
