package com.aitmansour.pharmacymanagementsystem.model.request;

import com.aitmansour.pharmacymanagementsystem.io.entity.Order;
import com.aitmansour.pharmacymanagementsystem.io.entity.Supplier;

import java.util.Date;
import java.util.Set;

public class ProductDetailsRequest {

    private String name;

    private String category;
    private String effets;
    private float purchasePrice;
    private float SellingPrice;

    private Date expiration_date;
    private Date registration_date;
    private Set<Supplier> suppliers;
    private Order order;
    private String storeBox;
}
