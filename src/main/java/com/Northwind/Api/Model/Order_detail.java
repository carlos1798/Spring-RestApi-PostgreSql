package com.Northwind.Api.Model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "order_details")
public class Order_detail {
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;



}
