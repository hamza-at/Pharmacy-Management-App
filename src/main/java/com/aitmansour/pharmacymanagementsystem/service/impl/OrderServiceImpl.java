package com.aitmansour.pharmacymanagementsystem.service.impl;

import com.aitmansour.pharmacymanagementsystem.io.entity.Order;
import com.aitmansour.pharmacymanagementsystem.io.repos.OrderRepository;
import com.aitmansour.pharmacymanagementsystem.service.OrderService;
import com.aitmansour.pharmacymanagementsystem.shared.OrderDto;
import org.modelmapper.ModelMapper;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderRepository.findByOrderId(orderId);
    }

     @Override
     public Order updateOrderDetails(String orderId, Order order) {
         Order returnValue = new Order();
       /*  ModelMapper modelMapper = new ModelMapper();

         Order orderEntity = orderRepository.findByOrderId(orderId);
         if (orderEntity == null) {

             //System.out.print("Can't find the order id from the database");



       /*  orderEntity.setItems(order.getItems());
         orderEntity.setSupplier(order.getSupplier());
         orderEntity.setUser(order.getUser());
         orderEntity.setPrice(order.getPrice());
         orderEntity.setPayedAmount(order.getPayedAmount());
         orderEntity.setStatus(order.getStatus());


         Order updatedOrder = orderRepository.save(orderEntity);
         returnValue = modelMapper.map(updatedOrder, OrderDto.class);
 */

         return returnValue;
     }

    @Override
    public void deleteOrder(String orderId) {
    orderRepository.deleteById(Long.valueOf(orderId));
    }

    @Override
    public List<Order> getOrders() {

        Iterable<Order> Orders = orderRepository.findAll();

        return (List<Order>) Orders;
    }
}
