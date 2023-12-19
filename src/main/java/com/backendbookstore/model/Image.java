package com.backendbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "is_icon")
    private boolean isIcon; // kiem tra xem co phai icon khong
    @Column(name = "link")
    private String link;
    @Column(name = "data")
    @Lob
    private String data;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
