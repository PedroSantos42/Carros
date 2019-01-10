package com.example.dweller.carros.entities;

import android.graphics.drawable.Drawable;

public class Car {

    public int id;
    public String model;
    public String manufactor;
    public int horsePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manufactor, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.picture = picture;
        this.horsePower = horsePower;
        this.price = price;
        this.manufactor = manufactor;
    }
}