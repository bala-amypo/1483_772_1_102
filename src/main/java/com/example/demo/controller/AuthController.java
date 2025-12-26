package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(
            @RequestBody User user
    ) {
        return ResponseEntity.ok(
                userService.register(user)
        );
    }

    @GetMapping("/login/{email}")
    public ResponseEntity<User> loginUser(
            @PathVariable String email
    ) {
        return ResponseEntity.ok(
                userService.findByEmail(email)
        );
    }
}
