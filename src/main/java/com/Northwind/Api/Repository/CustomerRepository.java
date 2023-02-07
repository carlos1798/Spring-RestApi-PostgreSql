package com.Northwind.Api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Northwind.Api.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
