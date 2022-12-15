package com.aitmansour.pharmacymanagementsystem.io.entity;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Supplier implements Serializable {
    @Serial
    private static final long serialVersionUID = -6346120796474180178L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String supplierId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false)
    private Double lng;
    @Column(nullable = false)
    private Double lat;
    private String description;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Order> items;





}
