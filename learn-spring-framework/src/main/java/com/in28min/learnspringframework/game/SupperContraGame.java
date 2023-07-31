package com.in28min.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SupperContraGameQualifier")
public class SupperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void left(){
        System.out.println("Left");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }
}
