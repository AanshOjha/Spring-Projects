package com.test.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id    // Tells this is primary key
    @GeneratedValue
    String name;
    String email;
    String location;

    public Person() {}
    public Person(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getLocation() {
        return location;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + ", Location=" + location + "]";
    }

    
}
