package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "users")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -3753911216867256002L;
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String id;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(nullable = false,length = 20)
    private String prenom;
    //private String image;
    @Column(nullable = false,length = 120, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private UserType usertype;

    @Column(nullable = false)
    private String telephone;
    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone=telephone;
    }

    public UserType getUsertype() {
        return usertype;
    }

    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }


    }
 enum UserType{
    DOCTOR,ASSISTANT
}