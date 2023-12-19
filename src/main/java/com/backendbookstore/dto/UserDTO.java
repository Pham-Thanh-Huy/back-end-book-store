package com.backendbookstore.dto;

import com.backendbookstore.model.Evaluation;
import com.backendbookstore.model.FavouriteBook;
import com.backendbookstore.model.Order;
import com.backendbookstore.model.Permission;
import lombok.Data;


import java.util.List;

@Data
public class UserDTO {

    private int userId;

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


    private List<Permission> permissionList;


    private List<Order> orderList;
}
