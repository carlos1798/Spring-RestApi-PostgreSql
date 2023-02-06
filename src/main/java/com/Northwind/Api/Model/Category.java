package com.Northwind.Api.Model;

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
    @Column(name="picture")
    private byte[] picture;

    @OneToMany(mappedBy = "category")
    private List<Product> products;




    

}