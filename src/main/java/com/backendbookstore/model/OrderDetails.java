package com.backendbookstore.model;

import lombok.Data;

@Data
public class OrderDetails {
    private long id;
    private int quantity;
    private double price;
    private Book book;
    private Order order;

}
