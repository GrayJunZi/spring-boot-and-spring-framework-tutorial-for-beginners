package com.grayjunzi.learnspringframework;

import com.grayjunzi.learnspringframework.game.GameRunner;
import com.grayjunzi.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
