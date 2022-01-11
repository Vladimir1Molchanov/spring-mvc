package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.dao.CarDao;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao crb;

    public CarServiceImpl(CarDao crb) {
        this.crb = crb;
    }


    @Override
    public String printCarsList(Integer count, Model model) {
        if (count == null || count > 5) {
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
