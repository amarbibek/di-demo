package com.mycodestuffs.didemo;

import com.mycodestuffs.didemo.controllers.ConstructorInjectedController;
import com.mycodestuffs.didemo.controllers.MyController;
import com.mycodestuffs.didemo.controllers.PropertyInjectedController;
import com.mycodestuffs.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");
        controller.greet();


        System.out.println(controller.greet());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }

}
