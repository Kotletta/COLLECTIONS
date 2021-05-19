package Cars;

import ModelCar.CargoType;

public class CargoCar extends Car {

    private CargoType cargoType;

    public CargoCar(String model, int cost, int fuelConsumption, int speed, CargoType cargoType){
        super(model, cost, fuelConsumption, speed);
        this.cargoType = cargoType;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", CargoType+ " + cargoType + "}");
    }

}
