package com.itv.cafe1.entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Data
@Entity
public class Product {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    private String name;
   
    private Double price;
    private String description;
        @ManyToOne
       @JoinColumn(name="category_id")
       private Category category;

       @ManyToMany
       @JoinTable(
        name="product_orders",
        joinColumns=@JoinColumn(name="product_id",referencedColumnName = "id"),
        inverseJoinColumns=@JoinColumn(name="order_id",referencedColumnName = "id")


       )
       private List<Orders>orders;
}