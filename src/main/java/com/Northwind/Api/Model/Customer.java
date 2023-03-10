package com.Northwind.Api.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "customers")
public class Customer {

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


    
   

}
