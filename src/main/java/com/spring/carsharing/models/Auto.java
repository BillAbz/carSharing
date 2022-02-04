package com.spring.carsharing.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Auto {
    @Id
    @GeneratedValue
    private Integer autoId;
    private String brand;
    private String type;
    private String plateNumber;
    private int model;
    private int numberOfSeats;
    private double dailyPrice;
    private boolean isAvailable;

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "autoId=" + autoId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", model=" + model +
                ", numberOfSeats=" + numberOfSeats +
                ", dailyPrice=" + dailyPrice +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
