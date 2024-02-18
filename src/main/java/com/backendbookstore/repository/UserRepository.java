package com.backendbookstore.repository;

import com.backendbookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "user")
public interface UserRepository  extends JpaRepository<User, Integer> {
   public boolean existsByUsername(String username);

    public boolean existsByEmail(String email);

    public User findByUsername(String username);


    @Query("SELECT u FROM User u WHERE u.email = :email")
    public User findByEmail(String email);
}
