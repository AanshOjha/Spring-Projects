package com.javajourney.learnspringframework.helloworld;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try (// Launch new Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Retrieving beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address1"));
            System.out.println(context.getBean(Address.class)); // instead of bean name can write recordName.class
            System.out.println(context.getBean("callUsingBeansWithParameters")); // created method with parameters of beans
            System.out.println(context.getBean("callUsingBeans")); // A bean which returns value of existng beans
            
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);  // list of all beans names created

        } catch (BeansException e) {
            e.printStackTrace();
        }
        
        // Configure the things we want Spring to manage
        // @Configuration in HelloWorldConfiguration
        // @Bean in name()


    }
}