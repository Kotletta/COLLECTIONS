//import Cars.Car;
//import Cars.CargoCar;
//import Cars.EmergencyCar;
//import Cars.PassengersCar;
//import ModelCar.CargoType;
//import ModelCar.EmergencyType;
//import ModelCar.PassengersType;
//
//import java.util.ArrayList;
//
//public class NewRunner {
//    public static void main(String[] args) {
//        ArrayList<Car> listOfCars = new ArrayList<>();
//
//        listOfCars.add(new PassengersCar("Kia Rio", 1500000, 10, 270, PassengersType.SEDAN));
//        listOfCars.add(new PassengersCar("Volkswagen Polo",1700000,9,280 , PassengersType.SEDAN));
//        listOfCars.add(new PassengersCar("AUDI TT",12000000 ,15 ,320 , PassengersType.COUPE));
//        listOfCars.add(new PassengersCar("HUMMER H2",6000000 ,21 ,150 , PassengersType.LIMOUSINE));
//        listOfCars.add(new CargoCar("GAZEL CARGO", 2500000,20,200, CargoType.CAMPER));
//        listOfCars.add(new CargoCar("SCANIA L-100", 10000000, 40, 250, CargoType.TRUCK));
//        listOfCars.add(new CargoCar("Универсал-445", 500000, 25, 100, CargoType.TRACTOR));
//        listOfCars.add(new EmergencyCar("SOBOL", 2700000, 15, 200, EmergencyType.AMBULANCE));
//        listOfCars.add(new EmergencyCar("GAZ 2010", 2000000, 17, 200, EmergencyType.POLICE));
//        listOfCars.add(new EmergencyCar("Reno MASTER", 2205000, 20, 210, EmergencyType.SWAT));
//        listOfCars.add(new EmergencyCar("Reno MASTERFIRE", 3500000, 37, 250, EmergencyType.FIRETRUCK));
//
//        listOfCars.sort((o1, o2) -> o1.getFuelConsumption() - o2.getFuelConsumption());
//        System.out.println(listOfCars.getModel);
//    }
//}
