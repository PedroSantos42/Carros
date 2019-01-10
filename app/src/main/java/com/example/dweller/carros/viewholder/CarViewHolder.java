package com.example.dweller.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.dweller.carros.R;
import com.example.dweller.carros.entities.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    TextView mTextModel;


    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = itemView.findViewById(R.id.text_model);
    }

    public void bindData(Car car) {
        this.mTextModel.setText(car.model);
    }
}
