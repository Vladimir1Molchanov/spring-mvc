package web.models;

public class Car {
    private int id;
    private String model;
    private long series;

    public Car() {

    }

    public Car(String model, long series) {
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car_id -> [" + id
                + "] Car_model -> [" + model
                + "] Car_series -> [" + series +"]";
    }
}
