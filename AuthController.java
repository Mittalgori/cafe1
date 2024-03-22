// package com.example.ecomm.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.ecomm.Service.AuthService;
// import com.example.ecomm.entities.RegisteredUser;

// @RestController
// public class AuthController {
//     @Autowired
//     private AuthService authservice;

//     @PostMapping("/register")
//     public ResponseEntity<?> register(@RequestBody RegisteredUser registeredUser) {
//         return new ResponseEntity<>(this.authservice.register(registeredUser), HttpStatus.CREATED);
//     }

//     @PostMapping("/login")
//     public ResponseEntity<?> login(@RequestBody RegisteredUser loginUser) {
//         if (authservice.login(loginUser.getEmail(), loginUser.getPassword())) {
//             return ResponseEntity.ok("Login successful");
//         } else {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
//         }
//     }

//     @PostMapping("/logout")
//     public ResponseEntity<?> logout() {
//         // Add your logout logic here if needed
//         // For example, clearing session data or revoking tokens
//         // Return appropriate response entity
//         return ResponseEntity.ok("Logged out successfully");
//     }
// }
// package com.example.ecomm.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.ecomm.Service.AuthService;
// import com.example.ecomm.entities.RegisteredUser;

// @RestController
// public class AuthController {
//     @Autowired
//     private AuthService  authservice;
//      @PostMapping("/register")
//      public ResponseEntity<?>register(@RequestBody RegisteredUser registeredUser)
//      {
//         return new  ResponseEntity<>(this.authservice.register(registeredUser),HttpStatus.CREATED);
//      }
    
// }
