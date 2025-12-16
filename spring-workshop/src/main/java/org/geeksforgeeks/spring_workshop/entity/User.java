package org.geeksforgeeks.spring_workshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")   // 👈 IMPORTANT
public class User {

    @Id
    private Integer id;
    private String name;

    public User() {}

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters & setters
}
