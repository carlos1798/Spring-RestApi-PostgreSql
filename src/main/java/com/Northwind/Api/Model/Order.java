package com.Northwind.Api.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.grammars.hql.HqlParser;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(exclude = "ship_via")
@Entity(name = "orders")
public class Order {

    private @Id
    @GeneratedValue int order_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer costumer;

    @ManyToOne(targetEntity =  Employee.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column
    private Date order_date;

    @Column
    private Date required_date;
    @Column
    private Date shipped_date;

    @Column
    private int ship_via;


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

    @OneToMany(mappedBy = "order_id")
    private List<Order_detail> order_details;


}
