package com.backendbookstore.controller;

import com.backendbookstore.model.User;
import com.backendbookstore.security.JwtResponse;
import com.backendbookstore.security.LoginRequest;
import com.backendbookstore.services.AccountService;
import com.backendbookstore.services.JwtService;
import com.backendbookstore.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;
    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<?> registerAccount(@Validated @RequestBody User user){
        ResponseEntity<?> response = accountService.registerAccount(user);
        return response;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/active")
    public ResponseEntity<?> activeAccount(@RequestParam String email, @RequestParam String codeActive ){
        ResponseEntity<?> response = accountService.activeAccount(email, codeActive);
        return response;
    }


    // đăng nhập
    @PostMapping("/login")
    public ResponseEntity<?> login(@Validated @RequestBody LoginRequest loginRequest){
        // Xác thực người dùng bằng tên đăng nhập và mật khẩu
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
            // Nếu xác thực thành công, tạo token JWT
            if(authentication.isAuthenticated()){
                final String jwt = jwtService.generateToken(loginRequest.getUsername());
                return ResponseEntity.ok(new JwtResponse(jwt));
            }
        }catch (AuthenticationException e){
            log.error("Authentication failed: {}", e.getMessage());
            return ResponseEntity.badRequest().body(Collections.singletonMap("error", "Tên đăng nhập hoặc mật khẩu không chính xác."));
        }

        return ResponseEntity.badRequest().body("Xác thực không thành công.");
    }
}



