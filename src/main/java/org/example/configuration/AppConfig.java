package org.example.configuration;

import org.example.model.Car;
import org.example.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.model")
public class AppConfig {

    @Bean
    public Car lexus(Engine lexusEngine) {
        return new Car(1, "Lexus", "RX 570", "Black", lexusEngine);
    }

    @Bean
    public Engine lexusEngine() {
        return new Engine("V8 5.7L", 383);
    }

    @Bean
    public Car ferrari(Engine ferrariEngine) {
        return new Car(2, "Ferrari", "812 Superfast", "Red", ferrariEngine);
    }

    @Bean
    public Engine ferrariEngine() {
        return new Engine("V12 6.5L", 789);
    }

    @Bean
    public Car tesla(Engine teslaEngine) {
        return new Car(3, "Tesla", "Model S Plaid", "Blue", teslaEngine);
    }

    @Bean
    public Engine teslaEngine() {
        return new Engine("Electric", 1020);
    }
}
