package com.r3dc1ph3rinc.springboot.mealprep.service;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Ingredient;
import com.r3dc1ph3rinc.springboot.mealprep.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient save(Ingredient ingredient) {

        return ingredientRepository.save(ingredient);
    }
}
