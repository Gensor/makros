package com.gensor.makros.resource;

import com.gensor.makros.model.Meal;
import com.gensor.makros.service.MealService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealResource {
    private final MealService mealService;

    public MealResource(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Meal>> findAllMeals(){
        List<Meal> meals = mealService.findAllMeals();
        return new ResponseEntity<>(meals, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Meal> findMealbyId(@PathVariable("id") Long id){
        Meal meal = mealService.findMealById(id);
        return new ResponseEntity<>(meal,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMeal(@PathVariable("id")Long id){
        mealService.deleteMeal(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Meal> updateMeal(@RequestBody Meal meal){
        Meal newMeal = mealService.updateMeal(meal);
        return new ResponseEntity<>(newMeal,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Meal> addMeal(@RequestBody Meal meal){
        Meal newMeal = mealService.addMeal(meal);
        return new ResponseEntity<>(newMeal, HttpStatus.CREATED);
    }
}
