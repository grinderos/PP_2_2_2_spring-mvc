package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;

    @Override
    public List<Car> getCars(int count) {
        if(count<5 && count>0) {
            return createCars(count).stream().limit(count).toList();
        } else {
            return createCars(count);
        }
    }

    private List<Car> createCars(int count) {
        if (cars == null) {
            cars = new ArrayList<>();
            cars.add(new Car("Aston Martin", "DB", 9));
            cars.add(new Car("Land-Rover", "Defender", 110));
            cars.add(new Car("Audi", "R", 8));
            cars.add(new Car("Mercedes-Benz", "E-Class W", 123));
            cars.add(new Car("Tesla", "Model", 3));
            cars.add(new Car("Mitsubishi", "Lancer", 9));
            cars.add(new Car("Ford", "Mustang Shelby GT", 500));
        }
        return cars;
    }
}
