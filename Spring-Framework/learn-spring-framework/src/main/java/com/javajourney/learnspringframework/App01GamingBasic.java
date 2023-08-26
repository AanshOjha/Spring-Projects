package com.javajourney.learnspringframework;

// Importing the runner which runs all methods
import com.javajourney.learnspringframework.game.GameRunner;

// Importing games
// import com.javajourney.learnspringframework.game.MarioGame; 
// import com.javajourney.learnspringframework.game.SuperContraGame;
import com.javajourney.learnspringframework.game.PacmanGame;



public class App01GamingBasic {
    public static void main(String[] args) {
        // var game = new SuperContraGame();
        // var game = new MarioGame();
        var game = new PacmanGame(); // Object creation
        var gameRunner = new GameRunner(game); // WIring of game object with GameRunner
        gameRunner.run();
    }
}

// GamingConsole is the dependency of gameRunner class