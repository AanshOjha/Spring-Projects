package com.javajourney.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javajourney.learnspringframework.game.GameRunner;
import com.javajourney.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        } 
        
    }
}
