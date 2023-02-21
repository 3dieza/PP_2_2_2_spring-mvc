package web.config.dao;

import org.springframework.stereotype.Component;
import web.config.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1,"BMV", "V666"));
        car.add(new Car(2,"Mers", "V1"));
        car.add(new Car(3,"Bentley", "V8"));
        car.add(new Car(4,"Tesla", "E-power"));
        car.add(new Car(5,"Lada", "marusya"));
    }
    public List<Car>index(){
        return car;

    }
public Car show(int id){
return car.stream().filter(car -> car.getId()==id).findAny().orElse(null);
    }
}

