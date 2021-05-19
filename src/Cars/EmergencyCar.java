package Cars;

import ModelCar.EmergencyType;

public class EmergencyCar extends Car {

    private EmergencyType emergencyType;

    public EmergencyCar(String model, int cost, int fuelConsumption, int speed, EmergencyType emergencyType){
        super(model, cost, fuelConsumption, speed);
        this.emergencyType = emergencyType;
    }

    public EmergencyType getEmergencyType() {
        return emergencyType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", EmergencyType=" + emergencyType + "}");
    }
}
