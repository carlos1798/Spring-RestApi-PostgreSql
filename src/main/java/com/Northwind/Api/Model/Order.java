package com.Northwind.Api.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "orders")
public class Order {
    
    private @Id @GeneratedValue int order_id;

    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer ;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column
    private Date order_date;

    @Column
    private Date required_date;    
    @Column
    private Date shipped_date;
    
    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shipper ship_via;
    @Column
    private double freight;
    @Column
    private String ship_name;
    @Column
    private String ship_address;
    @Column
    private String ship_city;
    @Column
    private String ship_region;
    @Column
    private String ship_postal_code;
    @Column
    private String ship_country;

    @OneToMany(mappedBy = "orders")
    private List<Order_detail> order_details;
}
