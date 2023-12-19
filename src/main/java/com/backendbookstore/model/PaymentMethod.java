package com.backendbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_method_id")
    private int paymentMethodId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description; // mô tả
    @Column(name = "payment_costs")
    private double paymentCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu

    @OneToMany(mappedBy = "paymentMethod", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    private List<Order> orderList;
}
