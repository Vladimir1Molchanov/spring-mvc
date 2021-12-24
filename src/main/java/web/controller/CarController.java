package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    List<Car> c = new ArrayList<>();

    public void addCars() {
        c.add(new Car("model1", 1));
        c.add(new Car("model2", 2));
        c.add(new Car("model3", 3));
        c.add(new Car("model4", 4));
        c.add(new Car("model5", 5));
    }


    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
        if (c.isEmpty()) {
            addCars();
        }
        if (count == null) {
            model.addAttribute("carCount", c);
        } else {
            List<Car> auto = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                auto.add(c.get(i));
            }
            model.addAttribute("carCount", auto);
        }
        return "cars";
    }
}
