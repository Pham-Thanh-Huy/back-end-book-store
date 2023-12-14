package com.backendbookstore.model;

import java.util.List;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private String ISBN;
    private String description; // mô tả
    private double listedPrice;
    private double price;
    private int quantity;
    private double rate; // đánh giá (vd: 5 sao)
    private List<Category> categoryList;
    private List<Image> imageList;
    private List<Evaluation> evaluationList;
    private List<OrderDetails> orderDetailsList;
    private List<FavouriteBook> favouriteBookList;
}
