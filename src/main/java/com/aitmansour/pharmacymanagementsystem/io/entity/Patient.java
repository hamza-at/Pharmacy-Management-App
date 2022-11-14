package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity(name="patients")
public class Patient implements Serializable {
    @Serial
    private static final long serialVersionUID = -3853911216867256002L;
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String id;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(nullable = false,length = 20)
    private String prenom;
    @Column(nullable = false,length = 120, unique = true)
    private String telephone;
    @Column(nullable = false)
    private List<String> allergies;
    private List<String> regDrugs;
    @Column(nullable = false)
    private String birthdate;
    private List<String> medproblems;
    @Column(nullable = false)
    private String recordDate;

}
