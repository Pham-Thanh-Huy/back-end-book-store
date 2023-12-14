package com.backendbookstore.model;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class Order {
    private int id;
    private Date createdAt;
    private String address;
    private double totalMoney;
    private List<OrderDetails> orderDetailsList;
    private User user;
    private PaymentMethod paymentMethod; // phương thức thanh toán
    private DeliveryMethod deliveryMethod; // phương thức giao hàng

}
