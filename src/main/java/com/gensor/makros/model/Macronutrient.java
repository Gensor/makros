package com.gensor.makros.model;

import javax.persistence.*;

@Entity
public class Macronutrient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    //protein
    //carbohydrate
    //fat
    //cholesterol
    //sodium



}
