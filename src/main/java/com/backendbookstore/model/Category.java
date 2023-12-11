package com.backendbookstore.model;

import java.util.List;
import lombok.Data;

@Data
public class Category {
    private int id;
    private String categoryName;
    private List<Book> listBook;
}
