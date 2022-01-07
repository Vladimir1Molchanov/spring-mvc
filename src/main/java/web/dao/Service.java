package web.dao;

import org.springframework.ui.Model;    
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<Car> addCars() {
        List<Car> c = new ArrayList<>();

        c.add(new Car("model1", 1));
        c.add(new Car("model2", 2));
        c.add(new Car("model3", 3));
        c.add(new Car("model4", 4));
        c.add(new Car("model5", 5));

        return c;
    }

    public static String printCarsList(Integer count, Model model, List<Car> c) {
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
