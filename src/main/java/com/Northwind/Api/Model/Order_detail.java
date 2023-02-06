package com.Northwind.Api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "order_details")
@IdClass(Order_details_key.class)
public class Order_detail {

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column
    private double unit_price;
    @Column
    private int quantity;
    @Column
    private double discount;

    public Order_detail() {
    }

    public Order_detail(Order order, Product product, double unit_price, int quantity, double discount) {
        this.order = order;
        this.product = product;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order_detail [order=" + order + ", product=" + product + ", unit_price=" + unit_price + ", quantity="
                + quantity + ", discount=" + discount + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((order == null) ? 0 : order.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        long temp;
        temp = Double.doubleToLongBits(unit_price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantity;
        temp = Double.doubleToLongBits(discount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order_detail other = (Order_detail) obj;
        if (order == null) {
            if (other.order != null)
                return false;
        } else if (!order.equals(other.order))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (Double.doubleToLongBits(unit_price) != Double.doubleToLongBits(other.unit_price))
            return false;
        if (quantity != other.quantity)
            return false;
        if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
            return false;
        return true;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
