package com.shahulsleycode.learn.springframework.learnspringframework;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.shahulsleycode.learn.springframework.games.GameRunner;

@Configuration
@ComponentScan("com.shahulsleycode.learn.springframework.games")
public class SpringApp {

    public static void main(String[] args){
        
       try(var context = new AnnotationConfigApplicationContext(SpringApp.class)){

        context.getBean(GameRunner.class).run();
        
        // Arrays.stream(context.getBeanDefinitionNames())
        //       .forEach(System.out::println);
       }
    
    }

}