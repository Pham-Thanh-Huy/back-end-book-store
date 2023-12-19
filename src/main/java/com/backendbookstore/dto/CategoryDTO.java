package com.backendbookstore.dto;

import com.backendbookstore.model.Book;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Integer categoryId;
    private String categoryName;
    private List<Book> listBook;
}
