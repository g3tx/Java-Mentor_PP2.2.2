package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String CarsTable(@RequestParam(value = "count", defaultValue = "99") int count,
                            Model model) {

        CarServiceImpl carService = new CarServiceImpl();
        CarDaoImpl carDao = new CarDaoImpl();

        List<Car> resultList = carService.getCars(carDao.getCars(), count);
        model.addAttribute("count", resultList);
        return "cars";
    }
}
