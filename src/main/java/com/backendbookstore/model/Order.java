package com.backendbookstore.model;

import lombok.Data;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;

@Data
public class Order {
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "address")
    private String address;
    @Column(name = "total_money")
    private double totalMoney;
    private List<OrderDetails> orderDetailsList;
    private User user;
    private PaymentMethod paymentMethod; // phương thức thanh toán
    private DeliveryMethod deliveryMethod; // phương thức giao hàng

}
