package com.aitmansour.pharmacymanagementsystem.io.entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

public class Supplier implements Serializable {
    @Serial
    private static final long serialVersionUID = -6346120796474180178L;

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String supplierId;

    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false)
    private Double lng;
    @Column(nullable = false)
    private Double lat;


}
