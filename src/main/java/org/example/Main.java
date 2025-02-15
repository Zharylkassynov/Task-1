package org.example;

import org.example.configuration.AppConfig;
import org.example.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerBean("toyota", Car.class);

        Car lexus = context.getBean("lexus", Car.class);
        Car ferrari = context.getBean("ferrari", Car.class);
        Car tesla = context.getBean("tesla", Car.class);
        Car toyota = context.getBean("toyota", Car.class);
        toyota.setBrand("Toyota");

        System.out.println(lexus);
        System.out.println(ferrari);
        System.out.println(tesla);
        System.out.println(toyota);
    }
}