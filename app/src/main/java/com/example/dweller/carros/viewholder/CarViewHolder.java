package com.example.dweller.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dweller.carros.R;
import com.example.dweller.carros.entities.Car;
import com.example.dweller.carros.listener.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextCarModel;
    private ImageView mImgCarPicture;
    private TextView mTextViewDetails;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextCarModel = itemView.findViewById(R.id.text_car_model);
        this.mImgCarPicture = itemView.findViewById(R.id.img_car_pic);
        this.mTextViewDetails = itemView.findViewById(R.id.text_view_details);
    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {

        this.mImgCarPicture.setImageDrawable(car.picture);
        this.mTextCarModel.setText(car.model);
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });
    }
}
