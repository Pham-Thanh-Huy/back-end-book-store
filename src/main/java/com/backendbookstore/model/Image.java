package com.backendbookstore.model;

import lombok.Data;

@Data
public class Image {
    private int id;
    private String imageName;
    private boolean isIcon; // kiem tra xem co phai icon khong
    private String link;
    private String data;
    private Book book;
}
