package com.gensor.makros.service;

import com.gensor.makros.exception.MealNotFoundException;
import com.gensor.makros.model.Meal;
import com.gensor.makros.repository.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MealService {
    private final MealRepo mealRepo;

    @Autowired
    public MealService(MealRepo mealRepo) {
        this.mealRepo = mealRepo;
    }

    public Meal addMeal(Meal meal){
        return mealRepo.save(meal);
    }

    public List<Meal> findAllMeals(){
        return mealRepo.findAll();
    }

    public Meal updateMeal(Meal meal){
        return mealRepo.save(meal);
    }

    public void deleteMeal(Long id){
        mealRepo.deleteMealById(id);
    }

    public Meal findMealById(Long id){
        return mealRepo.findMealById(id).orElseThrow( ()-> new MealNotFoundException("meal by id " + id + " doesnt exist"));
    }

}
