package com.aitmansour.pharmacymanagementsystem.io.entity;

import com.aitmansour.pharmacymanagementsystem.model.utils.Status;
import com.aitmansour.pharmacymanagementsystem.shared.ProductDto;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;


@Entity
public class Order implements Serializable {

        @Serial
        private static final long serialVersionUID = -6946120796474180178L;

        @Id
        @GeneratedValue
        @Column(nullable = false)
        private String orderId;

        @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
        private Set<Product> items;

         @ManyToOne
        @JoinColumn(name="supplierId",nullable = false)
        private Supplier supplier;

         @ManyToOne
         @JoinColumn(name="userId",nullable = false)
        private User user;

        @Column(nullable = false)
        private float price;




        @Column(nullable = false)
        private Status status;

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
//Status
//Pending payment — Order received, no payment initiated. Awaiting payment
//Failed — Payment failed or was declined
//Processing — Payment received (paid) and stock has been reduced
//Completed — Order fulfilled and complete – requires no further action.
//Canceled — Canceled by an admin or the customer – stock is increased, no further action required.
//Refunded - Refunded — Refunded by an admin – no further action required.