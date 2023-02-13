package com.Northwind.Api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Northwind.Api.Dto.CustomerResponse;
import com.Northwind.Api.Model.Customer;
import com.Northwind.Api.Repository.CustomerRepository;

@Service
public class CustomerService {
   
    @Autowired
    private CustomerRepository repository;
    
    public List<CustomerResponse> all(){
       List<Customer> customers = repository.findAll();
       return customers.stream().map(this::mapToCustomerResponse).toList();
    }

    public Optional<Customer> getCustomer(String customer_id){
        return repository.findById(customer_id);
    }

    private CustomerResponse mapToCustomerResponse(Customer customer) {
        return new CustomerResponse(customer.getCompany_name()
                        ,customer.getContact_title()
                        ,customer.getContact_title()
                        ,customer.getAddress()
                        ,customer.getCity()
                        ,customer.getRegion()
                        ,customer.getPostal_code()
                        ,customer.getCountry()
                        ,customer.getPhone()
                        ,customer.getFax());       

    }
    
}
