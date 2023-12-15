package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
public class PermissionUser {
    @Column(name = "permission_id")
    private int permissionId;
    @Column(name = "permission_name")
    private String permissionName;
    private List<User> userList;
}
