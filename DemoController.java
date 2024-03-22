// package com.example.ecomm.Controller;

// import org.springframework.security.access.annotation.Secured;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import jakarta.annotation.security.RolesAllowed;

// @RestController
// public class DemoController {
//     @PreAuthorize("hasRole('ADMIN')")
//     @GetMapping("/pre")
//     public String CheckPreAuthorize()
//     {
//         return "method executable only by the user with role Admin";
//     }
    

//      @RolesAllowed("HR")
//     @GetMapping("/allow")
//     public String checkRollAllowed()
//     {
//         return "method executable only by the user with role HR";
//     }


//     @Secured("ROLE_IT")
//     @GetMapping("/secure")
//     public String CheckSecured()
//     {
//         return "method executable only by the user with role IT";
//     }
// }
