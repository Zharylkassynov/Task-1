package org.example.model;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Engine {
    private String model;
    private int power;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }
}
