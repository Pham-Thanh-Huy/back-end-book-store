package com.backendbookstore.model;

import lombok.Data;

@Data
public class ShoppingCartDetail {
    private long id;
    private Book book;
    private int quantity;
}
