package com.backendbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "address")
    private String address;
    @Column(name = "payment_costs")
    private double paymentCosts; // chi phí thanh toán
    @Column(name = "delivery_costs")
    private double deliveryCosts; // chi phí vận chuyeenr
    @Column(name = "total_money")
    private double totalMoney;

    @OneToMany(mappedBy = "order", cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private List<OrderDetails> orderDetailsList;


    @ManyToOne( cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne( cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod; // phương thức thanh toán

    @ManyToOne( cascade =  {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "delivery_method_id")
    private DeliveryMethod deliveryMethod; // phương thức giao hàng

}
