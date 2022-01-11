package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    public static List<Car> c;

    {
        c = new ArrayList<>();
        c.add(new Car("model1", 1));
        c.add(new Car("model2", 2));
        c.add(new Car("model3", 3));
        c.add(new Car("model4", 4));
        c.add(new Car("model5", 5));
    }

    @Override
    public List<Car> getCars() {
        return c;
    }
}
