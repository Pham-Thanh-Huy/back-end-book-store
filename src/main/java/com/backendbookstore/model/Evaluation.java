package com.backendbookstore.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Evaluation {
    @Column(name = "evaluation_id")
    private long evaluationId;
    @Column(name = "rating_points")
    private float ratingPoints;
    @Column(name = "comment")
    private String comment;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    private Book book;

    private User user;
}
