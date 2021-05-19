package Cars;

import java.util.Objects;

public class Car {
    String model;
    private int cost;
    private int fuelConsumption;
    private int speed;

    public Car(String model, int cost, int fuelConsumption, int speed) {
        this.model = model;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cost == car.cost && fuelConsumption == car.fuelConsumption && speed == car.speed && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, cost, fuelConsumption, speed);
    }
}
