package com.backendbookstore.model;

import java.util.List;



import jakarta.persistence.Column;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import lombok.Data;

@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "isbn")
    private String ISBN;
    @Column(name = "description")
    private String description; // mô tả
    @Column(name = "describe")
    private String describe; // mô tả
    @Column(name = "listed_price")
    private double listedPrice;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "rate")
    private double rate; // đánh giá (vd: 5 sao)
    @Column(name = "category_list")
    private List<Category> categoryList;
    @Column(name = "image_list")
    private List<Image> imageList;
    private List<Evaluation> evaluationList;
    private List<OrderDetails> orderDetailsList;
    private List<FavouriteBook> favouriteBookList;


}
