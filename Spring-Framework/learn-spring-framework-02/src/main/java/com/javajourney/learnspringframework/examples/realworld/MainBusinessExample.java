package com.javajourney.learnspringframework.examples.realworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainBusinessExample {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                MainBusinessExample.class)
            ) {
            System.out.println(
                context.getBean(BusinessCalculationService.class).findMax()
            );
        
        }
    }
}
