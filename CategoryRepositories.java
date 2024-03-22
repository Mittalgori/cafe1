package com.itv.cafe1.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.cafe1.entities.Category;
@Repository
public interface CategoryRepositories  extends JpaRepository<Category,Integer>
{
    
}

