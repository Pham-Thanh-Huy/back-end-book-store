package com.backendbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "delivery_method")
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_method_id")
    private int deliveryMethodId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description; // mô tả
    @Column(name = "delivery_costs")
    private double deliveryCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu

    @OneToMany(mappedBy = "deliveryMethod", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    private List<Order> orderList;
}
