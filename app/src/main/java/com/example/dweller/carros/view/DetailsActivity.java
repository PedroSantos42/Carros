package com.example.dweller.carros.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dweller.carros.R;
import com.example.dweller.carros.constants.CarsConstants;
import com.example.dweller.carros.data.CarMock;
import com.example.dweller.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        this.mCarMock = new CarMock(this);

        this.mViewHolder.imageViewCar = findViewById(R.id.img_car_pic);
        this.mViewHolder.textCarModel = findViewById(R.id.text_car_model);
        this.mViewHolder.textManufactor = findViewById(R.id.text_car_manufactor);
        this.mViewHolder.textHorsePower = findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = findViewById(R.id.text_price);

        this.getDataFromActiviry();

        this.setData();
    }

    private void setData() {
        this.mViewHolder.textCarModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText(String.format("R$ %s", String.valueOf(this.mCar.price)));
        this.mViewHolder.imageViewCar.setImageDrawable(this.mCar.picture);
        this.mViewHolder.textManufactor.setText(this.mCar.manufactor);
    }

    private void getDataFromActiviry() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.getCar(extras.getInt(CarsConstants.CAR_ID));
        }
    }

    private static class ViewHolder {
        ImageView imageViewCar;
        TextView textCarModel;
        TextView textHorsePower;
        TextView textPrice;
        TextView textManufactor;
    }
}
