package Cars;

import ModelCar.PassengersType;

public class PassengersCar extends Car {

    private PassengersType passengersType;

    public PassengersCar(String model, int cost, int fuelConsumption, int speed, PassengersType passengersType){
        super(model, cost, fuelConsumption, speed);
        this.passengersType = passengersType;
    }

    public PassengersType getPassengersType() {
        return passengersType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", PassengersType=" + passengersType + "}");
    }
}
