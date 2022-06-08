package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars = Arrays.asList(
            new Car ("BMW", "black", 325),
            new Car ("Audio", "silver", 873),
            new Car ("Volkswagen", "black", 735),
            new Car ("Ferrari", "red", 264),
            new Car ("Opel", "yellow", 643));

    public List<Car> getCarsList() {
        return cars;
    }
}
