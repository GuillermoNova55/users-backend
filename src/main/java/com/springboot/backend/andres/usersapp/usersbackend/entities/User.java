package com.springboot.backend.andres.usersapp.usersbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;


    private String document;
    private String email;
    private String dateofbirth;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    // public String getLastname() {
    //     return lastname;
    // }
    // public void setLastname(String lastname) {
    //     this.lastname = lastname;
    // }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // public String getUsername() {
    //     return username;
    // }
    // public void setUsername(String username) {
    //     this.username = username;
    // }
    // public String getPassword() {
    //     return password;
    // }
    // public void setPassword(String password) {
    //     this.password = password;
    // }

    
}
