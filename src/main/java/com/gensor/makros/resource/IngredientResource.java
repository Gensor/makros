package com.gensor.makros.resource;

import com.gensor.makros.model.Ingredient;
import com.gensor.makros.service.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientResource {

    private final IngredientService ingredientService;

    public IngredientResource(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Ingredient>> findAllIngredients(){
        List<Ingredient> ingredients = ingredientService.findAllIngredients();
        return new ResponseEntity<>(ingredients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Ingredient> addIngredient(@RequestBody Ingredient ingredient){
        Ingredient newIngredient = ingredientService.addIngredient(ingredient);
        return new ResponseEntity<>(newIngredient, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Ingredient> updateIngredient(@RequestBody Ingredient ingredient){
        Ingredient newIngredient = ingredientService.updateIngredient(ingredient);
        return new ResponseEntity<>(newIngredient, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteIngredient(@PathVariable("id") Long id){
        ingredientService.deleteIngredient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Ingredient> findIngredientById(@PathVariable("id") Long id){
        Ingredient ingredient = ingredientService.findIngredientById(id);
        return new ResponseEntity<>(ingredient, HttpStatus.OK);
    }

}
