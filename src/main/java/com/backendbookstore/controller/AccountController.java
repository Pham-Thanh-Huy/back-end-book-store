package com.backendbookstore.controller;

import com.backendbookstore.model.User;
import com.backendbookstore.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @CrossOrigin("http://localhost:3000")
    @PostMapping("/register")
    public ResponseEntity<?> registerAccount(@Validated @RequestBody User user){
        ResponseEntity<?> response = accountService.registerAccount(user);
        return response;
    }
}
