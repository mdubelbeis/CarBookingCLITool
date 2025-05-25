package com.masondubelbeis.car;

import java.math.BigDecimal;

public class Car {
    private String regNumber;
    private BigDecimal rentalPricePerDay;
    private String brand;
    private boolean isElectric;

    public Car(String regNumber, BigDecimal rentalPricePerDay, String brand, boolean isElectric) {
        this.regNumber = regNumber;
        this.rentalPricePerDay = rentalPricePerDay;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
