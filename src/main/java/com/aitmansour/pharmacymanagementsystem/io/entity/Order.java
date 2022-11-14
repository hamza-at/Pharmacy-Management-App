package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

@Entity(name="Orders")
public class Order implements Serializable {

        @Serial
        private static final long serialVersionUID = -6946120796474180178L;

        @Id
        @GeneratedValue
        @Column(nullable = false)
        private String orderId;

        @Column(nullable = false)
        private float price;

        @Column(nullable = false)
        private String[] items;

      // @JoinColumn(name = "supplierId", nullable = false)
        private String SupplierId;

        @Column(nullable = false)
        private boolean status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String supplierId) {
        SupplierId = supplierId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderringEntity{" +
                "orderId='" + orderId + '\'' +
                ", price=" + price +
                ", items=" + Arrays.toString(items) +
                ", SupplierId='" + SupplierId + '\'' +
                ", status=" + status +
                '}';
    }
}
