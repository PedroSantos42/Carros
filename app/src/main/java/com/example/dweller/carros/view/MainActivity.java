package com.example.dweller.carros.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.dweller.carros.R;
import com.example.dweller.carros.adapter.CarsListAdapter;
import com.example.dweller.carros.constants.CarsConstants;
import com.example.dweller.carros.data.CarMock;
import com.example.dweller.carros.entities.Car;
import com.example.dweller.carros.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        CarMock carMock = new CarMock(this);
        List<Car> carList = new ArrayList<>(carMock.getList());

        // 1 - obter recyclerView
        this.mViewHolder.recyclerCars = findViewById(R.id.recycler_cars);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarsConstants.CAR_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };

        // 2 - adapters
        CarsListAdapter carsListAdapter = new CarsListAdapter(carList, listener);
        this.mViewHolder.recyclerCars.setAdapter(carsListAdapter);

        // 3 - definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }


    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}