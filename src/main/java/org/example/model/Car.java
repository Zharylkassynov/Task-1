package org.example.model;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private Engine engine;

    public Car(int id, String brand, String model, String color, Engine engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
}
