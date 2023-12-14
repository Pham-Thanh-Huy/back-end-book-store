package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

@Data
public class DeliveryMethod {
    private int id;
    private String name;
    private String describe; //mô tả
    private double deliveryCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu
    private List<Order> orderList;
}
