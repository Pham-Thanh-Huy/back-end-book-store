package com.backendbookstore.model;

import lombok.Data;

@Data
public class Evaluation {
    private long id;
    private float ratingPoints;
    private String comment;
    private Book book;
    private User user;
}
