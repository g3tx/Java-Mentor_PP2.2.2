package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("BMW", "X5", 2020));
        cars.add(new Car("Audi", "A4", 2019));
        cars.add(new Car("Ford", "Kuga", 2014));
        cars.add(new Car("Nissan", "X-Trail", 2021));
        cars.add(new Car("Renault", "Duster", 2013));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}



