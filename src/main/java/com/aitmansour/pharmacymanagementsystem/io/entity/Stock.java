package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Stock implements Serializable {
    @Serial
    private static final long serialVersionUID = -3353911216867256002L;

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String stockId;

    @OneToMany(mappedBy = "stock",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Product> items;

    private String description;

     @Column(nullable = false)
    private Date registrationDate;

}
