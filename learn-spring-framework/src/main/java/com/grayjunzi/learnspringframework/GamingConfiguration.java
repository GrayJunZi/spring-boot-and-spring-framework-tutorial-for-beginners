package com.grayjunzi.learnspringframework;

import com.grayjunzi.learnspringframework.game.GameRunner;
import com.grayjunzi.learnspringframework.game.GamingConsole;
import com.grayjunzi.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
