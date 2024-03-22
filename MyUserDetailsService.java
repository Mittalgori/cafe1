// package com.example.ecomm.Service;

// import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.example.ecomm.entities.RegisteredUser;
// import com.example.ecomm.repositories.RegisteredUserRepository;

// import jakarta.transaction.Transactional;
// @Service
// public class MyUserDetailsService  implements  UserDetailsService{
//     @Autowired
//     private  RegisteredUserRepository repository;

//     @Override
//     @Transactional
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         return  this.repository
//         .findByEmail(username)
//         .map(user->
//         {
//             return new  RegisteredUser(
//                 user.getEmail(),
//                 user.getPassword(),
//                 user.getRoles().stream()
//                 .map(role->new SimpleGrantedAuthority(role))
//                 .collect(Collectors.toList())

//             );
//         })
//         .orElseThrow(
//          ()->
//          {
//          throw new  UsernameNotFoundException("user with this email does not exits");
//          }
//         );
//     }

    
// }
