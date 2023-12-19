package com.backendbookstore.dto;

import com.backendbookstore.model.Book;
import lombok.Data;

@Data
public class ImageDTO {

    private int imageId;

    private String imageName;

    private boolean isIcon; // kiem tra xem co phai icon khong

    private String link;

    private String data;


    private Book book;
}
