package web.Service;

import org.springframework.ui.Model;
import web.dao.CarDao;
import web.dao.CarDaoBody;
import web.models.Car;

import java.util.List;

public class CarServiceBody implements CarService{

    private CarDaoBody crb;
    @Override
    public List<Car> addCars() {
        return crb.addCars();
    }

    @Override
    public String printCarsList(Integer count, Model model, List<Car> c) {
        return crb.printCarsList(count, model, c);
    }
}
