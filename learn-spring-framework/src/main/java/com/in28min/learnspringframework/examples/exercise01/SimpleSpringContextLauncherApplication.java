package com.in28min.learnspringframework.examples.exercise01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);

            System.out.println(businessCalculationService.findMax());

        }
    }
}