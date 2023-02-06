package com.Northwind.Api.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Order_details_key implements Serializable {

    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne 
    @JoinColumn(name = "product_id")
    private Product product;
}
