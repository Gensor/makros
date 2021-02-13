package com.gensor.makros.model.macro;

import javax.persistence.*;

@Embeddable
public class Protein {

    private double protein;

    public Protein() {
    }

    public Protein(double weight) {
        this.protein = weight;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double weight) {
        this.protein = weight;
    }
}
