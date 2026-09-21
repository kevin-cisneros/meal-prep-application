package com.r3dc1ph3rinc.springboot.mealprep.repository;

import com.r3dc1ph3rinc.springboot.mealprep.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
