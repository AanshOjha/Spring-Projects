package com.javajourney.learnspringboot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String lang;

    public Course() {
        
    }

    public Course(long id, String name, String lang) {
        this.id = id;
        this.name = name;
        this.lang = lang;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLang() {
        return lang;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", Lang=" + lang + "]";
    }
    
    
}
