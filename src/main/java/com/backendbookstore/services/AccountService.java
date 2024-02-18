package com.backendbookstore.services;

import com.backendbookstore.model.Message;
import com.backendbookstore.model.User;
import com.backendbookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private EmailServiceImpl emailService;

    public ResponseEntity<?> registerAccount(User user){
        // Kiem tra ten dang nhap da ton tai chua
        if(userRepository.existsByUsername(user.getUsername())){
            return ResponseEntity.badRequest().body(new Message("Ten dang nhap da ton tai"));
        }
        // Kiem tra email
        if(userRepository.existsByEmail(user.getEmail())){
            return ResponseEntity.badRequest().body(new Message("email da ton tai"));
        }

        //mã hoá mật khẩu
        String encryptPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encryptPassword);
        String codeActive = createCodeActive();
        // gán và gửi thông tin kích hoạt
            user.setCodeActive(codeActive);
            user.setActive(false);
            //lưu người dùng vào db
        User user_registerSuccess = userRepository.save(user);
        sendMailActive(user.getEmail(), codeActive);
        // gửi email cho người dùng để họ kích hoạt
        return ResponseEntity.ok("dang ki thanh cong");

    }

    private String createCodeActive(){
        return UUID.randomUUID().toString();
    }

    private void sendMailActive(String email, String codeActive){
        String subject = "Kích hoạt tài khoản của bạn tại wweb bán sách";
        String text = "Vui lòng sử dụng mã sau để kích hoạt cho tài khoản "+email+": <h5>"+codeActive+"</h5>";

        String url = "http://localhost:3000/active/"+email+"/"+codeActive+"";
        text += "<Br> Click vào đường link để kích hoạt tài khoản: <a href = '"+url+"'>click vao day</a>";
        emailService.sendMessage("phamthanhhuy3062k3@gmail.com", email, subject, text);
    }

    public ResponseEntity<?> activeAccount(String email, String codeActive){
        User user = userRepository.findByEmail(email);
        if(user==null){
            return ResponseEntity.badRequest().body(new Message("Người dùng không tồn tại"));
        }
        if(user.isActive() == true){
            return ResponseEntity.badRequest().body(new Message("Tài khoản đã được kích hoạt"));
        }

        if(codeActive.equals(user.getCodeActive())){
            user.setActive(true);
            userRepository.save(user);
            return ResponseEntity.ok("Kích hoạt tài khoản thành công");
        }else{
            return ResponseEntity.badRequest().body(new Message("Mã kích hoạt không chính xác"));
        }
    }
}
