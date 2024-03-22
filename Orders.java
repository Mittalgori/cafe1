package com.itv.cafe1.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

import jakarta.persistence.Entity;
@Data
@Entity
public class Orders {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   private String status;
   private float totalprice; 
   @ManyToMany(mappedBy = "orders")

   private List<Product>products;
}
