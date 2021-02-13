package com.gensor.makros.model.macro;

import javax.persistence.*;

@Embeddable
public class Fat {

    private double fat;
    private double cholesterol;

    public Fat() {
    }

    public Fat(double fat, double cholesterol) {
        this.fat = fat;
        this.cholesterol = cholesterol;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double weight) {
        this.fat = weight;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

}
