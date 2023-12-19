package com.backendbookstore.dto;

import com.backendbookstore.model.Book;
import com.backendbookstore.model.Order;

import lombok.Data;

@Data
public class OrderDetailsDTO {
    private long orderDetailsid;

    private int quantity;

    private double price;


    private Book book;


    private Order order;
}
