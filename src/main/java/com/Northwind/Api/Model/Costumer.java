package com.Northwind.Api.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "costumers")
public class Costumer {

    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private String customer_id;
    @Column
    private String company_name;
    @Column
    private String contact_name;
    @Column
    private String contact_title;
    @Column
    private String address;
    @Column 
    private String city;
    @Column 
    private String region;
    @Column
    private String postal_code;
    @Column
    private String country;
    @Column
    private String phone;
    @Column
    private String fax;

    @OneToMany(mappedBy = "costumer")
    private List<Order> orders;



}
