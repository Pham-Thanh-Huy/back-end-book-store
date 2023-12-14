package com.backendbookstore.model;

import lombok.Data;

@Data
public class FavouriteBook {
    private int id;
    private User user;
    private Book book;
}
