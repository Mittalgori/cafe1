package com.itv.cafe1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itv.cafe1.entities.Orders;



public interface  OrderRepositories extends JpaRepository<Orders,Integer>{
    
}
