package com.aitmansour.pharmacymanagementsystem.io.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
@Entity(name = "medicine")
public class Medicine implements Serializable {
    @Serial
    private static final long serialVersionUID = 767958036359069705L;

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String Id;


    @Column(nullable = false,length = 40)
    private String name;
    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String supplier_id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Medicine{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", supplier_id='" + supplier_id + '\'' +
                '}';
    }
}
