package com.rakovets.course.javabasics.practice.jcf.car;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearManufacture;
    private String registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nColor: " +
                color + "\nYearManufacture: " + yearManufacture +
                "\nRegistrationNumber: " + registrationNumber;
    }

    @Override
    public boolean equals(Car car) {
        return car.getBrand().equals(brand);
    }

    @Override
    public int hashCode() {
        return 15 * hashCode() + 7;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }
}
