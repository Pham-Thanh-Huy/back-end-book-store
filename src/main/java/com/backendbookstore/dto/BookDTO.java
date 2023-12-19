package com.backendbookstore.dto;

import com.backendbookstore.model.*;

import lombok.Data;

import java.util.List;

@Data
public class BookDTO {
    private int bookId;
    private String isbn;
    private String authorName;
    private String bookName;
    private String description;
    private Double listedPrice;
    private Double price;
    private int quantity;
    private Double rate;

    private List<Category> categoryList;

    private List<Image> imageList;

    private List<Evaluation> evaluationList;

    private List<OrderDetails> orderDetailsList;

    private List<FavouriteBook> favouriteBookList;

}
