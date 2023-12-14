package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String lastName;
    private String firstName;
    private String username; // tên đăng nhập
    private String password;
    private char sex;
    private String email;
    private String phoneNumber;
    private String address;
    private List<Evaluation> evaluationList;
    private List<FavouriteBook> favouriteBookList;
    private List<PermissionUser> permissionUserList;
    private List<Order>  orderList;
}
