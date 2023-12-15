package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Column;

@Data
public class User {
    @Column(name = "user_id")
    private int userId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "username")
    private String username; // tên đăng nhập
    @Column(name = "password")
    private String password;
    @Column(name = "sex")
    private char sex;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    private List<Evaluation> evaluationList;
    private List<FavouriteBook> favouriteBookList;
    private List<PermissionUser> permissionUserList;
    private List<Order> orderList;
}
