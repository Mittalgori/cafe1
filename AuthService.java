// package com.example.ecomm.Service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;
// import org.springframework.web.server.ResponseStatusException;

// import com.example.ecomm.entities.RegisteredUser;
// import com.example.ecomm.repositories.RegisteredUserRepository;

// @Service
// public class AuthService {
//     @Autowired
//     private RegisteredUserRepository repository;

//     @Autowired 
//     BCryptPasswordEncoder passwordEncoder;
   
    
//     public String  register(RegisteredUser registeruser)
//     {
//         if(this.repository.findByEmail(registeruser.getEmail()).isPresent())
//         {
//         throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,"user with this email already registerd ");
//     }

//     registeruser.setPassword(passwordEncoder.encode(registeruser.getPassword()));
// this.repository.save(registeruser);
// return "User registred sucessfully";
    
// }


    

// package com.example.ecomm.Service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;
// import org.springframework.web.server.ResponseStatusException;

// import com.example.ecomm.entities.RegisteredUser;
// import com.example.ecomm.repositories.RegisteredUserRepository;

// @Service
// public class AuthService {
//     @Autowired
//     private RegisteredUserRepository repository;

//     @Autowired 
//     private BCryptPasswordEncoder passwordEncoder;
   
    
//     public boolean register(RegisteredUser registerUser) {
//         if (repository.findByEmail(registerUser.getEmail()).isPresent()) {
//             throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User with this email already registered");
//         }

//         try {
//             String encodedPassword = passwordEncoder.encode(registerUser.getPassword());
//             registerUser.setPassword(encodedPassword);
//             repository.save(registerUser);
//             return true; // Registration successful
//         } catch (Exception e) {
//             throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to register user", e);
//         }
//     }
//     public boolean login(String email, String password) {
//         RegisteredUser user = repository.findByEmail(email)
//                 .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

//         if (passwordEncoder.matches(password, user.getPassword())) {
//             return true; // Login successful
//         } else {
//             throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Incorrect password");
//         }
//     }

//     public void logout() {
//         // Implement your logout logic here if needed
//         // For example, clearing session data or revoking tokens
//     }


