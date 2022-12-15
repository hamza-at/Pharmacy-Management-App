package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Patient implements Serializable {
    @Serial
    private static final long serialVersionUID = -3853911216867256002L;
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String patient_id;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(nullable = false,length = 20)
    private String prenom;
    @Column(nullable = false,length = 120, unique = true)
    private String telephone;


    /*@Column(nullable = false)
    private List<String> allergies;
    @Column(nullable = false)
    private List<String> regular_Drugs;
    @Column(nullable = false)
    private Date birthdate;
    private List<String> health_issues;
    @Column(nullable = false)
    private Date recordDate;*/
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Patient patient;


}
