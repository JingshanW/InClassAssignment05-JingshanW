package com.example.android.inclassassignment05_jingshanw;

import java.io.Serializable;

/**
 * Created by Jing on 2/27/17.
 */

public class Car implements Serializable
{
    private String brand;
    private String color;
    private int price;
    private boolean suv;


    public Car(String brand, String color,int price,boolean suv) {
        this.brand = brand;
        this.color = color;
        this.price=price;
        this.suv=suv;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public boolean isSuv() {
        return suv;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +"Color: "+ color+"\n"+"Price: "+price +"\n"+"Is it SUV? "+suv;
    }
}
