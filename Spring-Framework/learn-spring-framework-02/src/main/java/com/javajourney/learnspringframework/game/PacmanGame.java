package com.javajourney.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Go up Pacman");
    }

    @Override
    public void down() {
        System.out.println("Move Down Pacman");
    }

    @Override
    public void left() {
        System.out.println("Go left Pacman");
    }

    @Override
    public void right() {
        System.out.println("Move right Pacman");
    }
    
}
