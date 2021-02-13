package com.gensor.makros.model.micro;

import javax.persistence.Embeddable;

@Embeddable
public class Vitamin {
    //Fat-soluble vitamins
    double a;
    double d;
    double e;
    double k;
    //Water-soluble vitamins
    double b1;    //thiamine
    double b2;    //riboflavin
    double b3;    //niacin
    double b5;    //pantothenic acid
    double b6;    //pyridoxine
    double b7;    //biotin
    double b9;    //folate
    double b12;
    double c;

    public Vitamin() {
    }

    public Vitamin(double a, double d, double e, double k, double b1, double b2, double b3, double b5, double b6,
                   double b7, double b9, double b12, double c) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.k = k;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b5 = b5;
        this.b6 = b6;
        this.b7 = b7;
        this.b9 = b9;
        this.b12 = b12;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getB3() {
        return b3;
    }

    public void setB3(double b3) {
        this.b3 = b3;
    }

    public double getB5() {
        return b5;
    }

    public void setB5(double b5) {
        this.b5 = b5;
    }

    public double getB6() {
        return b6;
    }

    public void setB6(double b6) {
        this.b6 = b6;
    }

    public double getB7() {
        return b7;
    }

    public void setB7(double b7) {
        this.b7 = b7;
    }

    public double getB9() {
        return b9;
    }

    public void setB9(double b9) {
        this.b9 = b9;
    }

    public double getB12() {
        return b12;
    }

    public void setB12(double b12) {
        this.b12 = b12;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
