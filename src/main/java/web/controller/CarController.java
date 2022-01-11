package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {
    private final CarService cs;

    public CarController(CarService cs) {
        this.cs = cs;
    }

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
        return cs.printCarsList(count, model);
    }
}
