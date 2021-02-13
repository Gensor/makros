package com.gensor.makros.model;

import com.gensor.makros.model.macro.Carbohydrate;
import com.gensor.makros.model.macro.Fat;
import com.gensor.makros.model.macro.Protein;
import com.gensor.makros.model.micro.Mineral;
import com.gensor.makros.model.micro.Vitamin;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String name;
    //macro
    private Protein protein;
    private Carbohydrate carbohydrate;
    private Fat fat;
    //micro
    private Mineral mineral;
    private Vitamin vitamin;

    public Ingredient() {
    }

    public Ingredient(
            Long id,
            String name,
            Protein protein,
            Carbohydrate carbohydrate,
            Fat fat,
            Mineral mineral,
            Vitamin vitamin)
    {
        this.id = id;
        this.name = name;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fat = fat;
        this.mineral = mineral;
        this.vitamin = vitamin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Carbohydrate getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Carbohydrate carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(protein, that.protein) &&
                Objects.equals(carbohydrate, that.carbohydrate) &&
                Objects.equals(fat, that.fat) &&
                Objects.equals(mineral, that.mineral) &&
                Objects.equals(vitamin, that.vitamin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                protein,
                carbohydrate,
                fat,
                mineral,
                vitamin);
    }
}
