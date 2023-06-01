package com.grayjunzi.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // 1: 启动 Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: 配置 @Configuration

        // 3: 检索 Spring管理的 Beans
        var name = context.getBean("name");
        System.out.println(name);

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        // System.out.println(context.getBean("address"));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person4Qualifier"));

        // Arrays.stream(context.getBeanDefinitionNames())
        //        .forEach(System.out::println);

    }
}