package com.backendbookstore.dto;

import com.backendbookstore.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class DeliveryMethodDTO {
    private Integer deliveryMethodId;
    private Double deliveryCosts;
    private String description;
    private String name;

    private List<Order> orderList;

}
