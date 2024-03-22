// package com.example.ecomm;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// import com.example.ecomm.Service.MyUserDetailsService;
// @Configuration
// @EnableWebSecurity
// @EnableMethodSecurity(
//     prePostEnabled = true,
//     jsr250Enabled=true,
//     securedEnabled=true
// )
// public class SecurityConfiguration {
//     @Bean
//     public SecurityFilterChain configure(HttpSecurity http)throws Exception 
//     {
       
//         http
//          .csrf().disable()
//         .authorizeHttpRequests()
//         .requestMatchers("/products/**","/categories/**")
//         .permitAll()
//        .requestMatchers("/users/**").hasRole("HR")
     
//      .requestMatchers("/orderes/**").hasRole("IT")

//       .requestMatchers(HttpMethod.POST,"/register").permitAll()
//        .anyRequest().authenticated()
//         .and()
//         .httpBasic()
//         .and()
//         .authenticationProvider(daoAuthenticationProvider());
        
//         return http.build();
//     }
//     @Bean
//     public UserDetailsService user()
//     {
//     UserDetails user1=User.builder()
//                        .username("gojou")
//                        .password(passwordEncoder().encode("abc"))
//                        .roles("HR")
//                        .build();
//     // UserDetails user2=User.builder()
//     //                    .username("rohan")
//     //                  .password(passwordEncoder().encode("abc"))
//     //                    .roles("IT")
//     //                    .build();
//     // UserDetails user3=User.builder()
//     //                    .username("admin")
//     //                 .password(passwordEncoder().encode("admin"))
//     //                    .roles("HR","IT","ADMIN")
//     //                    .build();   
//     // return new  InMemoryUserDetailsManager(user1,user2,user3);  
//     return new  InMemoryUserDetailsManager(user1);                                             
//     }   
//     @Bean
// public  BCryptPasswordEncoder passwordEncoder()
// {
//     return new BCryptPasswordEncoder();
// }

// @Autowired
// private MyUserDetailsService myUserDetailsServiceService;
// @Bean
// public  DaoAuthenticationProvider daoAuthenticationProvider()
// {
//     DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//     provider.setUserDetailsService(this.myUserDetailsServiceService);
//     provider.setPasswordEncoder(this.passwordEncoder());
//     return provider;
// }

// }
