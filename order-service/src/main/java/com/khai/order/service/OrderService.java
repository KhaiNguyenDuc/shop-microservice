package com.khai.order.service;

import com.khai.order.dto.OrderResponse;

import java.util.List;

public interface OrderService {
    List<OrderResponse> findAll();
}
