package web.dao;

import org.springframework.ui.Model;
import web.models.Car;

import java.util.List;

public interface CarDao {
List<Car> carList();
    }
