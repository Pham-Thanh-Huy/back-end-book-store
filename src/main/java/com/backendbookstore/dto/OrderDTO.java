package com.backendbookstore.dto;

import com.backendbookstore.model.DeliveryMethod;
import com.backendbookstore.model.OrderDetails;
import com.backendbookstore.model.PaymentMethod;
import com.backendbookstore.model.User;
import lombok.Data;
import java.sql.Date;
import java.util.List;

@Data
public class OrderDTO {
    private int orderId;

    private Date createdAt;

    private String address;

    private double paymentCosts; // chi phí thanh toán

    private double deliveryCosts; // chi phí vận chuyeenr

    private double totalMoney;


    private List<OrderDetails> orderDetailsList;



    private User user;


    private PaymentMethod paymentMethod; // phương thức thanh toán


    private DeliveryMethod deliveryMethod; // phương thức giao hàng
}
