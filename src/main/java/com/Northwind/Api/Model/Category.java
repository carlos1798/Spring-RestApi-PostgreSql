package com.Northwind.Api.Model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "categories")
public class Category {

    @Id
    private int category_id;

    @Column
    private String category_name;

    @Column
    private String description;




    @OneToMany(mappedBy = "category")
    private List<Product> products;

} 