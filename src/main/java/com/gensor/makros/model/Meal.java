package com.gensor.makros.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
   // private List<Ingredient> ingredients;

}
