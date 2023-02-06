package com.Northwind.Api.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
    
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getQuantity_per_unit() {
        return quantity_per_unit;
    }
    public void setQuantity_per_unit(String quantity_per_unit) {
        this.quantity_per_unit = quantity_per_unit;
    }
    public double getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
    public int getUnits_in_stock() {
        return units_in_stock;
    }
    public void setUnits_in_stock(int units_in_stock) {
        this.units_in_stock = units_in_stock;
    }
    public int getUnits_on_order() {
        return units_on_order;
    }
    public void setUnits_on_order(int units_on_order) {
        this.units_on_order = units_on_order;
    }
    public int getReorder_level() {
        return reorder_level;
    }
    public void setReorder_level(int reorder_level) {
        this.reorder_level = reorder_level;
    }
    public int getDiscontinued() {
        return discontinued;
    }
    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }





}
