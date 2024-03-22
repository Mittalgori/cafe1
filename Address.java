package com.itv.cafe1.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Data
@Entity
public class Address {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    private String Pincode;
    private String locality;
    private String Flatnumber;
    private String Landmark;
    private String City;
    private String State;
    //inverse side==>opposite to owining  side 
//will not contain the foreign ,key
@OneToOne(mappedBy = "address")
private User user;

}
