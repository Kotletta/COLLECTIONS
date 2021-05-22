import Cars.Car;
import Cars.CargoCar;
import Cars.EmergencyCar;
import Cars.PassengersCar;
import ModelCar.CargoType;
import ModelCar.EmergencyType;
import ModelCar.PassengersType;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Runner {
    private static List<Car> cars = Arrays.asList(
            new PassengersCar("Kia Rio", 1500000, 10, 270, PassengersType.SEDAN),
            new PassengersCar("Volkswagen Polo",1700000,9,280 , PassengersType.SEDAN),
            new PassengersCar("AUDI TT",12000000 ,15 ,320 , PassengersType.COUPE),
            new PassengersCar("HUMMER H2",6000000 ,21 ,150 , PassengersType.LIMOUSINE),
            new CargoCar("GAZEL CARGO", 2500000,20,200, CargoType.CAMPER),
            new CargoCar("SCANIA L-100", 10000000, 40, 250, CargoType.TRUCK),
            new CargoCar("Универсал-445", 500000, 25, 100, CargoType.TRACTOR),
            new EmergencyCar("SOBOL", 2700000, 15, 190, EmergencyType.AMBULANCE),
            new EmergencyCar("GAZ 2010", 2000000, 17, 180, EmergencyType.POLICE),
            new EmergencyCar("Reno MASTER", 2205000, 20, 210, EmergencyType.SWAT),
            new EmergencyCar("Reno MASTERFIRE", 3500000, 37, 250, EmergencyType.FIRETRUCK)
    );




    public static void main(String[] args) {
        TaxiCompany taxiCompany = new TaxiCompany(cars);
        System.out.println("Общая стоимость таксопарка: " + taxiCompany.getTotalCost() + " руб.");
        cars.sort((o1, o2) -> o1.getFuelConsumption() - o2.getFuelConsumption());
        System.out.println("Сортировка автомобилей по расходу топлива: " + cars);
        System.out.println("Автомобили со скоростью от 260 км/ч до 300 км/ч: " + taxiCompany.getListSortBySpeed());

    }
}
