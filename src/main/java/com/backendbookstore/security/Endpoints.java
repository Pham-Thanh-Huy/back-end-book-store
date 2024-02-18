package com.backendbookstore.security;

public class Endpoints {
public static final  String front_end_host = "http://localhost:3000";

    public static final String [] PUBLIC_GET_ENDPOINT ={
            "/book",
            "/book/**",
            "/image",
            "/image/**",
            "/user/search/existsByEmail",
            "/user/search/existsByUsername",
            "/api/account/active"
    };


    public static final  String [] PUBLIC_POST_ENDPOINT = {
            "/api/account/register",
            "/api/account/login"
    };

    public static final String [] ADMIN_POST_ENDPOINT = {
            "/book"
    };


    public static final String [] ADMIN_GET_ENDPOINT = {
        "/user",
        "/user/**"
    };
}
