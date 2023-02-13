package com.Northwind.Api.Model;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;

    @Column
    private String last_name;
    @Column
    private String first_name;
    @Column
    private String title;
    @Column
    private String title_of_court;
    @Column
    private Date birth_date;
    @Column
    private Date hire_date;
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
    private String home_phone;
    @Column
    private String extension;
    @Lob
    @Column
    private byte[] photo;
    @Column
    private String notes;
    @Column
    private String photo_path;
    @ManyToOne
    @JoinColumn(name = "reports_to")
    private Employee manager;
    
}
