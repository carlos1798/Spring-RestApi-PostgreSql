package com.Northwind.Api.Model;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "suppliers")
public class Supplier {

    @Id
    private int supplier_id;

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
    private String phone;
    
    @Column
    private String fax;

    @Column
    private String homepage;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

}
