package com.Northwind.Api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "order_details")
public class Order_detail {

    @Id
    private int order_id;

    @Id
    private int product_id;

    @Column
    private double unit_price;
    @Column
    private int quantity;
    @Column
    private double discount;
}