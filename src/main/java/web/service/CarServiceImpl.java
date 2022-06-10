package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{


    private List<Car> cars = Arrays.asList(
            new Car ("BMW", "black", 325),
            new Car ("Audio", "silver", 873),
            new Car ("Volkswagen", "black", 735),
            new Car ("Ferrari", "red", 264),
            new Car ("Opel", "yellow", 643));


    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return Collections.emptyList();
        } else {
            return cars
                    .stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }
}
