package com.aitmansour.pharmacymanagementsystem.shared;

import com.aitmansour.pharmacymanagementsystem.io.entity.Product;
import com.aitmansour.pharmacymanagementsystem.io.entity.Supplier;
import com.aitmansour.pharmacymanagementsystem.io.entity.User;
import com.aitmansour.pharmacymanagementsystem.model.utils.Status;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

public class OrderDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -6946120796474180178L;

    private String orderId;

    private Set<Product> items;

    private Supplier supplier;

    private User user;

    private float price;


    private Status status;

    public OrderDto() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Set<Product> getItems() {
        return items;
    }

    public void setItems(Set<Product> items) {
        this.items = items;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
