package com.itv.cafe1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.cafe1.entities.Address;



@Repository
public interface  AddressRepositories extends JpaRepository<Address,Integer>
{}
    

