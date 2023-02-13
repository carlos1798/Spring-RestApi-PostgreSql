package com.Northwind.Api.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "products")
public class Product {

    @Id
    private int product_id;

    @Column
    private String product_name;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column 
    private String quantity_per_unit;
    @Column 
    private double unit_price;
    @Column 
    private int units_in_stock;
    @Column 
    private int units_on_order;
    @Column
    private int reorder_level;
    @Column 
    private int discontinued;
    
 
}
