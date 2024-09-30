package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "5", 2024));
        carList.add(new Car("AUDI", "A8", 2019));
        carList.add(new Car("Mercedes", "S600", 2021));
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Porsche", "Cayenne", 2023));
    }


    @Override
    public List<Car> getCars() {
        return carList;
    }
}