package com.gensor.makros.model.macro;

import javax.persistence.*;

@Embeddable
public class Carbohydrate {

    private double carbohydrate;
    private double sugar;
    private double fiber;

    public Carbohydrate(double carbohydrate, double sugar, double fiber) {
        this.carbohydrate = carbohydrate;
        this.sugar = sugar;
        this.fiber = fiber;
    }

    public Carbohydrate() {

    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double weight) {
        this.carbohydrate = weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

}
