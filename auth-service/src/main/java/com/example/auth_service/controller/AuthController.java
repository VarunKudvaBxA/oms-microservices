package com.example.auth_service.controller;
import com.example.auth_service.service.JwtService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;
    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String role) {

        return jwtService.generateToken(username, role);

    }
}