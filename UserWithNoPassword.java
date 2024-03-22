package com.itv.cafe1.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nopassword",types={User.class})
public interface UserWithNoPassword {
    String getName();
    String  getEmail();
    String getMobile();
    

}
