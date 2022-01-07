package web;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> c = new ArrayList<>();
        c.add(new Car("model1", 1));
        c.add(new Car("model2", 2));
        c.add(new Car("model3", 3));
        c.add(new Car("model4", 4));
        c.add(new Car("model5", 5));

    }
}
