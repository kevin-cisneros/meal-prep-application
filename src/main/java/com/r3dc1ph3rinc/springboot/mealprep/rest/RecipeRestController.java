package com.r3dc1ph3rinc.springboot.mealprep.rest;


import com.r3dc1ph3rinc.springboot.mealprep.entity.Recipe;
import com.r3dc1ph3rinc.springboot.mealprep.entity.RecipeIngredients;
import com.r3dc1ph3rinc.springboot.mealprep.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/mealprepfoods"})
public class RecipeRestController {
    private final RecipeService recipeService;

    @Autowired
    public RecipeRestController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"/recipes"})
    public List<Recipe> findAll() {
        return this.recipeService.findAll();
    }

    @GetMapping({"/recipes/{id}"})
    public Recipe findByID(@PathVariable Long id) {
        return this.recipeService.findById(id);
    }

    @PostMapping({"/saverecipe"})
    public Recipe saveRecipe(@Valid @RequestBody Recipe newRecipe) {
        return this.recipeService.save(newRecipe);
    }

    @PostMapping({"/recipeingredient"})
    public RecipeIngredients save(@Valid @RequestBody RecipeIngredients recipeIngredients) {

       return recipeService.save(recipeIngredients);
    }

}
