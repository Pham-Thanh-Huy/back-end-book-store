package com.backendbookstore.model;

import java.util.List;
import lombok.Data;

@Data
public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private String ISBN;
    private String describe; // mô tả
    private double listedPrice;
    private double price;
    private int quantity;
    private double rate; // đánh giá (vd: 5 sao)
    private List<Category> listCategory;
    private List<Image> listImage;
    private List<Evaluation> listEvaluation;
    private List<ShoppingCartDetail> listShoppingCartDetail;
}
