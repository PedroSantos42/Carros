package com.example.dweller.carros.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.dweller.carros.R;
import com.example.dweller.carros.adapter.CarsListAdapter;
import com.example.dweller.carros.data.CarMock;
import com.example.dweller.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        // 1 - obter recyclerView
        this.mViewHolder.recyclerCars = findViewById(R.id.recycler_cars);

        // 2 - adapters
        CarsListAdapter carsListAdapter = new CarsListAdapter(carList);
        this.mViewHolder.recyclerCars.setAdapter(carsListAdapter);

        // 3 - definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }


    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}