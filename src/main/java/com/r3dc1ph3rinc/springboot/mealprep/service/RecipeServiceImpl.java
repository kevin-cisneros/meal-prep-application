package com.r3dc1ph3rinc.springboot.mealprep.service;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Recipe;
import com.r3dc1ph3rinc.springboot.mealprep.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe save(Recipe newRecipe) {
        return recipeRepository.save(newRecipe);
    }
}
