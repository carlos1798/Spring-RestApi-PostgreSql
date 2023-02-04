package com.Northwind.Api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "employees")
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;
    


}
