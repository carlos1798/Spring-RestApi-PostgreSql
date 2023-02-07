package com.Northwind.Api.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "orders")
public class Order {

    private @Id @GeneratedValue int order_id;

    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Customer costumer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column
    private Date order_date;

    @Column
    private Date required_date;
    @Column
    private Date shipped_date;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shipper ship_via;
    @Column
    private double freight;
    @Column
    private String ship_name;
    @Column
    private String ship_address;
    @Column
    private String ship_city;
    @Column
    private String ship_region;
    @Column
    private String ship_postal_code;
    @Column
    private String ship_country;

    @OneToMany(mappedBy = "order")
    private List<Order_detail> order_details;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Customer getCostumer() {
        return costumer;
    }

    public void setCostumer(Customer costumer) {
        this.costumer = costumer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getRequired_date() {
        return required_date;
    }

    public void setRequired_date(Date required_date) {
        this.required_date = required_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public Shipper getShip_via() {
        return ship_via;
    }

    public void setShip_via(Shipper ship_via) {
        this.ship_via = ship_via;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public String getShip_city() {
        return ship_city;
    }

    public void setShip_city(String ship_city) {
        this.ship_city = ship_city;
    }

    public String getShip_region() {
        return ship_region;
    }

    public void setShip_region(String ship_region) {
        this.ship_region = ship_region;
    }

    public String getShip_postal_code() {
        return ship_postal_code;
    }

    public void setShip_postal_code(String ship_postal_code) {
        this.ship_postal_code = ship_postal_code;
    }

    public String getShip_country() {
        return ship_country;
    }

    public void setShip_country(String ship_country) {
        this.ship_country = ship_country;
    }

    public List<Order_detail> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(List<Order_detail> order_details) {
        this.order_details = order_details;
    }

}
