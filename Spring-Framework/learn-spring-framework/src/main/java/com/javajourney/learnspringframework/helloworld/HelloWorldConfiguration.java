package com.javajourney.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Aansh";
    }

    @Bean
    public int age() {
        return 17;
    }

    @Bean
    public Person callUsingBeans() {
        return new Person(name(), age());
    }

    @Bean
    public Person callUsingBeansWithParameters(String name, int age) {
        return new Person(name, age);
    }

    @Bean
    // This is record 
    // First declare whats in this record
    // then create method setting up variables
    public Person person() {
        var person = new Person("Ananay", 22);
        return person;
    }

    @Bean(name = "address1")   // Optional: can change bean name but havae to mention it in other file
    public Address address1() {
        var address = new Address("N-2 Road", "Kanpur");
        return address;
    }

    @Bean(name = "address2") 
    @Primary
    public Address address2() {
        var address = new Address("Bijnor Road", "Lucknow");
        return address;
    }
    
}
