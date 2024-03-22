package com.itv.cafe1.repositories;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.itv.cafe1.entities.Product;



@Repository
public interface Productrepository extends JpaRepository<Product,Integer>{
       @RestResource(path="lessthan")
    List<Product>findByPriceLessThan(Long value);
     @RestResource(path="greaterthan")
    List<Product>findByPriceGreaterThan(Long value);

    
}
