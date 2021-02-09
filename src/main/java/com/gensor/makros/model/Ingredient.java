package com.gensor.makros.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String name;
  //  private List<Macronutrient> macronutrients;
}
