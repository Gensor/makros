package com.gensor.makros.repository;

import com.gensor.makros.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {

}
