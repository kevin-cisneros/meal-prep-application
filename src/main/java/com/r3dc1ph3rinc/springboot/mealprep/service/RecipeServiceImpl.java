package com.r3dc1ph3rinc.springboot.mealprep.service;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Recipe;
import com.r3dc1ph3rinc.springboot.mealprep.entity.RecipeIngredients;
import com.r3dc1ph3rinc.springboot.mealprep.repository.RecipeIngredientsRepository;
import com.r3dc1ph3rinc.springboot.mealprep.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private final RecipeIngredientsRepository recipeIngredientsRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeIngredientsRepository recipeIngredientsRepository) {
        this.recipeRepository = recipeRepository;
        this.recipeIngredientsRepository = recipeIngredientsRepository;
    }


    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe save(Recipe newRecipe) {
        return recipeRepository.save(newRecipe);
    }

    @Override
    public RecipeIngredients save(RecipeIngredients newRecipeIngredients) {
        return recipeIngredientsRepository.save(newRecipeIngredients);
    }

    @Override
    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }

}
