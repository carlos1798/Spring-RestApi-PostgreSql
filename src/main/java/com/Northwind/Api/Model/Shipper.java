package com.Northwind.Api.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="shippers")
public class Shipper {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int shipper_id;
    @Column
    private String company_name;
    @Column
    private String phone;

    @OneToMany(mappedBy = "ship_via")
    private List<Order> orders;

}
