package com.itv.cafe1.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="withaddress",types={User.class,Address.class})
public interface UserWithAddress {
    String getName();
    Address getAddress();

}
