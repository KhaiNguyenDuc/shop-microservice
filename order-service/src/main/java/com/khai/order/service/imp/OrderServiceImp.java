package com.khai.order.service.imp;

import com.khai.order.dto.OrderResponse;
import com.khai.order.service.OrderService;
import com.khai.order.model.Order;
import com.khai.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImp implements OrderService {

    private final ModelMapper mapper;
    private final OrderRepository orderRepository;
    @Override
    public List<OrderResponse> findAll() {
        List<Order> orders = orderRepository.findAll();
        return Arrays.asList(mapper.map(orders, OrderResponse[].class));
    }
}
