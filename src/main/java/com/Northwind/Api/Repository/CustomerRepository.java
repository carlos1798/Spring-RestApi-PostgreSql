package com.Northwind.Api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Northwind.Api.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Optional<Customer> findById(String customer_id);

}
