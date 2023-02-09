package com.Northwind.Api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Northwind.Api.Model.Customer;
import com.Northwind.Api.Repository.CustomerRepository;

@Service
public class CustomerService {
   
    @Autowired
    private CustomerRepository repository;
    
    public List<Customer> all(){
        return repository.findAll();
    }

    public Optional<Customer> getCustomer(String customer_id){
        return repository.findById(customer_id);
    }
    

}
