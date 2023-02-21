package web.config.service;

import org.springframework.stereotype.Service;
import web.config.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(1L, "Toyota", "Camry", 2020));
        carList.add(new Car(2L, "Honda", "Civic", 2021));
        carList.add(new Car(3L, "Ford", "Mustang", 2019));
        carList.add(new Car(4L, "Chevrolet", "Impala", 2022));
        carList.add(new Car(5L, "Nissan", "Altima", 2018));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarListByCount(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}