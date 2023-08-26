package com.javajourney.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javajourney.learnspringframework.game.GameRunner;
import com.javajourney.learnspringframework.game.GamingConsole;
import com.javajourney.learnspringframework.game.MarioGame;


@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new MarioGame(); // switch between 3 games by changing this
        return game;
    }

    @Bean
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
