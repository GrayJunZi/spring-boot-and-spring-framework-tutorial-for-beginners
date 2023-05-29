package com.grayjunzi.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // 1: 启动 Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: 配置 @Configuration

        // 3: 检索 Spring管理的 Beans
        var name = context.getBean("name");
        System.out.println(name);
    }
}