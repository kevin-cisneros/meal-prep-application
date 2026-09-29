package com.r3dc1ph3rinc.springboot.mealprep.service;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Recipe;
import com.r3dc1ph3rinc.springboot.mealprep.entity.RecipeIngredients;

import java.util.List;

public interface RecipeService {
    List<Recipe>findAll();

    Recipe save(Recipe newRecipe);

    RecipeIngredients save(RecipeIngredients newRecipeIngredients);

    Recipe findById(Long id);


}
