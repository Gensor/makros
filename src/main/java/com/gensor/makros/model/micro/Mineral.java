package com.gensor.makros.model.micro;

import javax.persistence.Embeddable;

@Embeddable
public class Mineral {
    double calcium;
    double phosphorus;
    double magnesium;
    double sodium;
    double chloride;
    double potassium;
    double sulphur;
    double iron;
    double manganese;
    double copper;
    double zinc;
    double iodine;
    double fluoride;
    double selenium;

    public Mineral() {
    }

    public Mineral(double calcium, double phosphorus, double magnesium, double sodium, double chloride,
                   double potassium, double sulphur, double iron, double manganese, double copper, double zinc,
                   double iodine, double fluoride, double selenium) {
        this.calcium = calcium;
        this.phosphorus = phosphorus;
        this.magnesium = magnesium;
        this.sodium = sodium;
        this.chloride = chloride;
        this.potassium = potassium;
        this.sulphur = sulphur;
        this.iron = iron;
        this.manganese = manganese;
        this.copper = copper;
        this.zinc = zinc;
        this.iodine = iodine;
        this.fluoride = fluoride;
        this.selenium = selenium;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(double phosphorus) {
        this.phosphorus = phosphorus;
    }

    public double getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(double magnesium) {
        this.magnesium = magnesium;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getChloride() {
        return chloride;
    }

    public void setChloride(double chloride) {
        this.chloride = chloride;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getSulphur() {
        return sulphur;
    }

    public void setSulphur(double sulphur) {
        this.sulphur = sulphur;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getManganese() {
        return manganese;
    }

    public void setManganese(double manganese) {
        this.manganese = manganese;
    }

    public double getCopper() {
        return copper;
    }

    public void setCopper(double copper) {
        this.copper = copper;
    }

    public double getZinc() {
        return zinc;
    }

    public void setZinc(double zinc) {
        this.zinc = zinc;
    }

    public double getIodine() {
        return iodine;
    }

    public void setIodine(double iodine) {
        this.iodine = iodine;
    }

    public double getFluoride() {
        return fluoride;
    }

    public void setFluoride(double fluoride) {
        this.fluoride = fluoride;
    }

    public double getSelenium() {
        return selenium;
    }

    public void setSelenium(double selenium) {
        this.selenium = selenium;
    }
}
