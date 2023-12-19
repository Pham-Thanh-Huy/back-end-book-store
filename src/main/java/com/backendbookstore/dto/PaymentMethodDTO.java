package com.backendbookstore.dto;

import com.backendbookstore.model.Order;
import lombok.Data;


import java.util.List;

@Data
public class PaymentMethodDTO {

    private int paymentMethodId;

    private String name;

    private String description; // mô tả

    private double paymentCosts; // chi phí thanh toán của hình thức đấy là bao nhiêu


    private List<Order> orderList;
}
