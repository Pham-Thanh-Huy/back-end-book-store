package com.backendbookstore.dto;

import com.backendbookstore.model.Book;
import com.backendbookstore.model.User;
import lombok.Data;

@Data
public class FavouriteBookDTO {
    private int favouriteBookId;
    private User user;
    private Book book;


}
