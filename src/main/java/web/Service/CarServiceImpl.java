package web.Service;

import org.springframework.ui.Model;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDaoImpl crb;

    @Override
    public String printCarsList(Integer count, Model model, List<Car> c) {
        if (count == null) {
            model.addAttribute("carCount", crb.getCars());
        } else {
            List<Car> auto = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                auto.add(crb.getCars().get(i));
            }
            model.addAttribute("carCount", auto);
        }
        return "cars";
    }
}
