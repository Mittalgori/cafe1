package com.itv.cafe1.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   @NotNull(message="name canot be null")
    @NotEmpty(message="name canot be empty")
   @Size(min=3,max=10,message="name shoud have min =3 and max 10 character")
   private String name;
    @NotNull(message="email canot be null")
    @NotEmpty(message="email canot be empty")
    @Email
   private String email;
    @NotNull(message="password canot be null")
    @NotEmpty(message="password canot be empty")   
       @Size(min=6,message="password shoud have minimum 6 character")
   private String password;

   private String  mobile;
  @OneToOne
  @JoinColumn(name="address_id")
  private Address address;
}
