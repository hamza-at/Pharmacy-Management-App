package com.aitmansour.pharmacymanagementsystem.shared;

import com.aitmansour.pharmacymanagementsystem.io.entity.Order;
import com.aitmansour.pharmacymanagementsystem.io.entity.Stock;
import com.aitmansour.pharmacymanagementsystem.io.entity.Supplier;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class ProductDto implements Serializable {
        private static final long serialVersionUID = 59478036359069705L;


        private String productId;

        private String name;

        private String category;
        private String effets;
        private Stock stock;
        private int quantity;


    private float purchasePrice;
    private float sellingPrice;

        private Date expirationdate;
        private Date registrationdate;
        private Set<Supplier> suppliers;
        private Order order;
        private String storeBox;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    public String getEffets() {
        return effets;
    }

    public void setEffets(String effets) {
        this.effets = effets;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getStoreBox() {
        return storeBox;
    }

    public void setStoreBox(String storeBox) {
        this.storeBox = storeBox;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
