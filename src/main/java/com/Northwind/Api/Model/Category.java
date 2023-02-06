package com.Northwind.Api.Model;

import java.util.Arrays;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity(name = "categories")
public class Category {

    @Id
    private int category_id;

    @Column
    private String category_name;

    @Column
    private String description;

    @Lob
    @Column(name = "picture")
    private byte[] picture;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category() {
    }

    public Category(int category_id, String category_name, String description, byte[] picture, List<Product> products) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.description = description;
        this.picture = picture;
        this.products = products;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category [category_id=" + category_id + ", category_name=" + category_name + ", description="
                + description
                + ", picture=" + Arrays.toString(picture) + ", products=" + products + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + category_id;
        result = prime * result + ((category_name == null) ? 0 : category_name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + Arrays.hashCode(picture);
        result = prime * result + ((products == null) ? 0 : products.hashCode());
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
        Category other = (Category) obj;
        if (category_id != other.category_id)
            return false;
        if (category_name == null) {
            if (other.category_name != null)
                return false;
        } else if (!category_name.equals(other.category_name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (!Arrays.equals(picture, other.picture))
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        return true;
    }

    
}
