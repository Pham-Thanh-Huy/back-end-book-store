package com.backendbookstore.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
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
    // @ManyToMany()
    private List<Category> listCategory;
    private List<Image> listImage;
    private List<Evaluation> listEvaluation;
    private List<ShoppingCartDetail> listShoppingCartDetail;
}
