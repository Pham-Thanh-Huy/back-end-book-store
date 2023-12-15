package com.backendbookstore.model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OrderDetails {
    @Column(name = "order_details_id")
    private long orderDetailsid;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
    private Book book;
    private Order order;

}
