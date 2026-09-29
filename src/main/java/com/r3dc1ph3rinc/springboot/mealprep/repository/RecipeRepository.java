package com.r3dc1ph3rinc.springboot.mealprep.repository;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
