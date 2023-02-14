package com.Northwind.Api.Dto;

import com.Northwind.Api.Model.Customer;
import com.Northwind.Api.Model.Employee;
import com.Northwind.Api.Model.Order_detail;
import com.Northwind.Api.Model.Shipper;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderResponse {
    private Customer customer;
    private Employee employee;
    private Date order_date;
    private Date required_date;
    private Date shipped_date;
    private Shipper ship_via;
    private double freight;
    private String ship_name;
    private String ship_address;
    private String ship_city;
    private String ship_region;
    private String ship_postal_code;
    private String ship_country;
    private List<Order_detail> orderDetailList;

    public OrderResponse(Customer costumer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate, Shipper shipVia, double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
    }

    public OrderResponse(Customer costumer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate, double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
    }

    public OrderResponse(String contactName, Employee employee, Date orderDate, Date requiredDate, Date shippedDate, double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
    }
}
