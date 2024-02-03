package com.backendbookstore.services;

import com.backendbookstore.model.Message;
import com.backendbookstore.model.User;
import com.backendbookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> registerAccount(User user){
        // Kiem tra ten dang nhap da ton tai chua
        if(userRepository.existsByUsername(user.getUsername())){
            return ResponseEntity.badRequest().body(new Message("Ten dang nhap da ton tai"));
        }
        // Kiem tra email
        if(userRepository.existsByEmail(user.getEmail())){
            return ResponseEntity.badRequest().body(new Message("email da ton tai"));
        }
        User user_registerSuccess = userRepository.save(user);
        return ResponseEntity.ok("dang ki thanh cong");
    }
}
