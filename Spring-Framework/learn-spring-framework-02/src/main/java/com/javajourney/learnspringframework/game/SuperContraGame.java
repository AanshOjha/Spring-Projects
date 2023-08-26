package com.javajourney.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Go up Contra");
    }

    public void down() {
        System.out.println("Go down Contra");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Move forward");
    }
    
}
