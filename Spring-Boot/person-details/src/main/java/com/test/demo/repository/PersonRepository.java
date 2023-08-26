package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.bean.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

}
