package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.Service;
import web.models.Car;

import java.util.List;

@Controller
public class CarController {

    List<Car> c = Service.addCars();

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
        return Service.printCarsList(count, model, c);
    }
}
