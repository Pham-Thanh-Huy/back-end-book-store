package com.backendbookstore.dto;

import com.backendbookstore.model.Book;
import com.backendbookstore.model.User;

import lombok.Data;

@Data
public class EvaluationDTO {
    private Long evaluationId;
    private String comment;
    private Float ratingPoints;

    private Book book;

    private User user;

}
