package com.backendbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "code_active")
    private String codeActive;
    @Column(name = "avatar", columnDefinition = "LONGTEXT")
    @Lob
    private String avatar;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private List<Evaluation> evaluationList;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private List<FavouriteBook> favouriteBookList;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.PERSIST})
    @JoinTable(name = "user_permission", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissionList;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private List<Order> orderList;



    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                ", codeActive='" + codeActive + '\'' +
                ", evaluationList=" + evaluationList +
                ", favouriteBookList=" + favouriteBookList +
                ", permissionList=" + permissionList +
                ", orderList=" + orderList +
                '}';
    }
}
