package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
public class DeliveryMethod {
    @Column(name = "delivery_method_id")
    private int deliveryMethodId;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe; // mô tả
    @Column(name = "delivery_costs")
    private double deliveryCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu
    private List<Order> orderList;
}
