package com.backendbookstore.dto;

import com.backendbookstore.model.User;

import lombok.Data;

import java.util.List;

@Data
public class PermissionDTO {
    private int permissionId;

    private String permissionName;


    private List<User> userList;
}
