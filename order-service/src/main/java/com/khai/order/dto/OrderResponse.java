package com.khai.order.dto;

import com.khai.order.model.OrderItem;
import com.khai.order.model.OrderTrack;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderResponse {
    private Long id;

    private Date orderDate;

    private String deliverMethod;

    private Double deliverCost;

    private List<OrderItem> orderItems;

    private OrderTrack orderTrack;

    private Long userId;

    private Double totalPrice;

    private Double totalProductPrice;
}
