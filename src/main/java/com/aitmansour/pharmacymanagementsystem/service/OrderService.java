package com.aitmansour.pharmacymanagementsystem.service;

import com.aitmansour.pharmacymanagementsystem.io.entity.Order;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public interface OrderService {

        Order createOrder(Order order);
       Order getOrderById(String orderId);
       Order updateOrderDetails(String orderId, Order order);
        void deleteOrder(String orderId);
        List<Order> getOrders();
    }
