package com.aitmansour.pharmacymanagementsystem.io.entity;


import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 767958036359069705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String effets;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private float SellingPrice;
    @Column(nullable = false)
    private Date expirationDate;

    @Column(nullable = false)
    private Date registrationDate;

    @Column(nullable = false)
    private String storeBox;
    /*   function that allow to verify the number of item available of a particular product */

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "product_supplier",joinColumns = {@JoinColumn(name = "productId")},
            inverseJoinColumns = {@JoinColumn(name = "supplierId")})
    private Set<Supplier> suppliers;

    @ManyToOne()
    @JoinColumn(name = "stockId")
    private Stock stock;

    @ManyToOne()
    @JoinColumn(name = "orderId")
    private Order order;

    /*a voir a */
   @ManyToOne()
   @JoinColumn(name = "sellId")
   private Sell sell;

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

    public Date getExpirationDate(Date expirationdate) {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return SellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public String getStoreBox() {
        return storeBox;
    }

    public void setStoreBox(String storeBox) {
        this.storeBox = storeBox;
    }
}