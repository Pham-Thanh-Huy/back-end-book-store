package com.backendbookstore.model;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
public class PaymentMethod {
    @Column(name = "payment_method_id")
    private int paymentMethodId;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe; // mô tả
    @Column(name = "payment_costs")
    private double paymentCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu
    private List<Order> orderList;
}
