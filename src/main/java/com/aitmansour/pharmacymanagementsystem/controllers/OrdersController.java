package com.aitmansour.pharmacymanagementsystem.controllers;

import com.aitmansour.pharmacymanagementsystem.service.OrderService;
import com.aitmansour.pharmacymanagementsystem.shared.ProductDto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    OrderService orderService;


    }
