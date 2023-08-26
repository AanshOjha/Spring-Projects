package com.javajourney.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javajourney.learnspringframework.game.GameRunner;
import com.javajourney.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.javajourney.learnspringframework.game") // Telling where to scan for components

// Made MarioGame and GameRunner a component 
// Spring auto created object for us and Auto-Wired the things!
// If many games implements GameinngConsole make anyone @Primary otherwise ERROR.

// @Primary gives top preference UNTIL...
// @Qualifier("QualifierName") gives topum top priority

// @primary: when whether 1 or many sorting algos, gives the preferred one 
// @Qualifier: when want specific sorting algo
public class GamingAppLauncher {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        } 
        
    }
}
