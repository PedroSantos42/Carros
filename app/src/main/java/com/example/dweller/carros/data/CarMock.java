package com.example.dweller.carros.data;

import com.example.dweller.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;

    public CarMock() {
        this.mListCars = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            this.mListCars.add(new Car(i, String.valueOf(i), i * 10, Double.valueOf(i * 55)));
        }
    }

    public List<Car> getList() {
        return this.mListCars;
    }

    public Car getCar(int id) {
        return this.mListCars.get(id);
    }
}
