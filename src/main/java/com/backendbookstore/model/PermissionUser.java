package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

@Data
public class PermissionUser {
    private int id;
    private String permissionName;
    private List<User> userList;
}
