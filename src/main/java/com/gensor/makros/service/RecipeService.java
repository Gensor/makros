package com.gensor.makros.service;

import com.gensor.makros.exception.RecipeNotFoundException;
import com.gensor.makros.model.Recipe;
import com.gensor.makros.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepo recipeRepo;

    @Autowired
    public RecipeService(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    public Recipe addRecipe(Recipe recipe){
        return recipeRepo.save(recipe);
    }

    public Recipe updateRecipe(Recipe recipe){
        return recipeRepo.save(recipe);
    }

    public void deleteRecipe(Long id){
        recipeRepo.deleteById(id);
    }

    public List<Recipe> findAllRecipes(){
        return recipeRepo.findAll();
    }

    public Recipe findRecipeById(Long id){
        return recipeRepo.findById(id).orElseThrow( () -> new RecipeNotFoundException(" recipe with id " + id + " was not found"));
    }
}
