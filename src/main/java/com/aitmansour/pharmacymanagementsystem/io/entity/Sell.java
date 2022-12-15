package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Sell implements Serializable {
    @Serial
    private static final long serialVersionUID = -356531216867256002L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int sellId;

    @OneToMany(mappedBy = "sell",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Product> items;

    private String description;

    private float totalprice;

    private float tax;

    private PayementMode payementType;

    @JoinColumn(name = "patientId")
    @OneToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @JoinColumn(name = "userId")
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

}
enum PayementMode{
    PAPER_CHECK, CASH, CREDIT_CARD
        }
