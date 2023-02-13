package com.Northwind.Api.Repository;

import com.Northwind.Api.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
