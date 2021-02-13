package com.gensor.makros.repository;

import com.gensor.makros.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient, Long> {
    void deleteMealById(Long id);
}
