package com.Northwind.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Northwind.Api.Model.Customer;
import com.Northwind.Api.Service.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<List<Customer>>(service.all(), HttpStatus.OK);
    }

    @GetMapping("/{customer_id}")
    public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable("customer_id") String customer_id) {
        return new ResponseEntity<Optional<Customer>>(service.getCustomer(customer_id), HttpStatus.OK);

    }

}
