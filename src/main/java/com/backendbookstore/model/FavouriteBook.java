package com.backendbookstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class FavouriteBook {
    @Column(name = "favourite_book_id")
    private int favouriteBookId;
    private User user;
    private Book book;
}
