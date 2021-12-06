package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        if (count > 5) return carDao.getCars().subList(0, 5);
        else return carDao.getCars().subList(0, count);
    }
}
