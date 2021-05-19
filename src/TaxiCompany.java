import Cars.Car;

import java.util.ArrayList;
import java.util.List;

public class TaxiCompany {
    private List<Car> cars;

    public TaxiCompany (List<Car> cars){
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (Car cost: cars) {
            totalCost += cost.getCost();
        }
        return totalCost;
    }
     Object getListSortBySpeed () {
        List<Car> listSortBySpeed = new ArrayList<>();
        int speedMin = 260;
        int speedMax = 300;
        for (Car c : cars){
            if (c.getSpeed() >= speedMin && c.getSpeed() <= speedMax){
                listSortBySpeed.add(c);
            }
        }
        return listSortBySpeed;

     }


}
