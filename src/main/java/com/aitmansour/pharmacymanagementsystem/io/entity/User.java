package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -3753911216867256002L;
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(nullable = false,length = 20)
    private String prenom;
    @Column(nullable = false,length = 120, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false,length = 120)
    private String telephone;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Order> items;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private Sell sell;

}
 enum Role{
    DOCTOR,ASSISTANT
}