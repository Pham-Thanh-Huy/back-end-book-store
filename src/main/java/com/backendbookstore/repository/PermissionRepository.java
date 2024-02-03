package com.backendbookstore.repository;

import com.backendbookstore.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "permission")
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    public  Permission findByPermissionName(String permissionName);
}
