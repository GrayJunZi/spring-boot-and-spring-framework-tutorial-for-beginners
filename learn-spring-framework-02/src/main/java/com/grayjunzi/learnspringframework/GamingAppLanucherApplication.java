package com.grayjunzi.learnspringframework;

import com.grayjunzi.learnspringframework.game.GameRunner;
import com.grayjunzi.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.grayjunzi.learnspringframework.game")
public class GamingAppLanucherApplication {

    public static  void main(String[] args){

        try(var context = new AnnotationConfigApplicationContext(GamingAppLanucherApplication.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}

