package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoBody;
import web.models.Car;

import java.util.List;

@Controller
public class CarController {
    CarDao cs = new CarDaoBody();
    List<Car> c = cs.addCars();

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
        return cs.printCarsList(count, model, c);
    }
}
