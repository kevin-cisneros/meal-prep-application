package com.r3dc1ph3rinc.springboot.mealprep.repository;

import com.r3dc1ph3rinc.springboot.mealprep.entity.RecipeIngredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Long> {
}
