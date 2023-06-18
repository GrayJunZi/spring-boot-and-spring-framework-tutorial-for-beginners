package com.grayjunzi.learnspringframework.examples.h1;

import com.grayjunzi.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLanucherApplication {

    public static  void main(String[] args){

        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            context.getBean(GameRunner.class).run();
        }
    }
}

