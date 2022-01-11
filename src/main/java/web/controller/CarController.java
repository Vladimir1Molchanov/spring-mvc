package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import javax.annotation.Resource;


@Controller
public class CarController {
    @Resource(name = "carServiceImpl")
    private CarService cs;

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
         return cs.printCarsList(count, model);
    }
}
