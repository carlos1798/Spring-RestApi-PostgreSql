package com.Northwind.Api.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Northwind.Api.Repository.CustomerRepository;
import com.Northwind.Api.Model.Customer;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    CustomerController(CustomerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/customers")
    List<Customer> all(){
        return repository.findAll();
    }
    
}
