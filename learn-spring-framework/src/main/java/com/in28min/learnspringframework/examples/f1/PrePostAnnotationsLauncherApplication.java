package com.in28min.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class SomeClass {

    private final SomeDependency someDependency;

    @Autowired
    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Cleanup");
    }

}

@Component
class SomeDependency {


    public void getReady(){
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class);
        try {

        } finally {
            context.close();
        }
    }
}