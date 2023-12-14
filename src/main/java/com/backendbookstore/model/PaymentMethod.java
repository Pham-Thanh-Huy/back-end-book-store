package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

@Data
public class PaymentMethod {
    private int id;
    private String name;
    private String describe; //mô tả
    private double paymentCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu
    private List<Order> orderList;
}
