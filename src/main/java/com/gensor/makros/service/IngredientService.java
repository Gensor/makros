package com.gensor.makros.service;

import com.gensor.makros.exception.IngredientNotFoundException;
import com.gensor.makros.exception.MealNotFoundException;
import com.gensor.makros.model.Ingredient;
import com.gensor.makros.model.Meal;
import com.gensor.makros.repository.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepo ingredientRepo;

    @Autowired
    public IngredientService(IngredientRepo ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    public List<Ingredient> findAllIngredients(){
        return ingredientRepo.findAll();
    }

    public Ingredient findIngredientById(Long id){
        return ingredientRepo.findById(id)
                .orElseThrow( ()-> new IngredientNotFoundException("ingredient with id " + id + " was not found"));
    }

    public Ingredient addIngredient(Ingredient ingredient){
        return ingredientRepo.save(ingredient);
    }


    public Ingredient updateIngredient(Ingredient ingredient){
        return ingredientRepo.save(ingredient);
    }

    public void deleteIngredient(Long id){
        ingredientRepo.deleteMealById(id);
    }

}
