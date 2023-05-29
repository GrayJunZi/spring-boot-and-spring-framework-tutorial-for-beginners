package com.grayjunzi.learnspringframework;

import com.grayjunzi.learnspringframework.game.GameRunner;
import com.grayjunzi.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args){

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}

