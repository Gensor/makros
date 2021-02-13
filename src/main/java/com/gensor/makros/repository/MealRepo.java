package com.gensor.makros.repository;

import com.gensor.makros.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MealRepo extends JpaRepository<Meal, Long> {
    void deleteMealById(Long id);

    Optional<Meal> findMealById(Long id);
}
