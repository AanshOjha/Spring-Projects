package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.bean.Person;
import com.test.demo.repository.PersonRepository;

@RestController // Tells this class is Spring MVC controller that handles incoming HTTP requests and produces the response 

public class PersonDetails {
    @Autowired     // inject an instance of the PersonRepository interface into the PersonDetailsRunner class
    private PersonRepository repo;


    @GetMapping("/details")      // map an HTTP GET request to a specific method in a controller class
    public List<Person> getDetails() {
        return repo.findAll();
    }
}
