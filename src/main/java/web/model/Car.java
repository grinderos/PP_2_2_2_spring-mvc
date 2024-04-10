package web.model;

public class Car {
    private String carmaker;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String carmaker, String model, int series) {
        this.carmaker = carmaker;
        this.model = model;
        this.series = series;
    }

    public String getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(String carmaker) {
        this.carmaker = carmaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car [ " + carmaker + " | " + model + " | " + series + " ]";
    }
}
