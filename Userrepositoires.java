package com.itv.cafe1.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.itv.cafe1.entities.User;
import com.itv.cafe1.entities.UserWithAddress;
//setting default projection of the user entity
@RepositoryRestResource(excerptProjection = UserWithAddress.class)
 
public interface Userrepositoires  extends JpaRepository<User,Integer>{
List<User>findByName(String name);
List<User>findByEmail(String email);
List<User>findByEmailContaining(String email);
  
}

