package web.Service;

import org.springframework.ui.Model;
import web.models.Car;

import java.util.List;

public interface CarService {
    String printCarsList(Integer count, Model model, List<Car> c);
}
