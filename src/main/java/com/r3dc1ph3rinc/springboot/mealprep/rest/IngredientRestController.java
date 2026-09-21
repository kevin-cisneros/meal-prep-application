package com.r3dc1ph3rinc.springboot.mealprep.rest;


import com.r3dc1ph3rinc.springboot.mealprep.entity.Ingredient;
import com.r3dc1ph3rinc.springboot.mealprep.repository.IngredientRepository;
import com.r3dc1ph3rinc.springboot.mealprep.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientRestController {

    private final IngredientService ingredientService;

    @Autowired
    public IngredientRestController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/getall")
    public List<Ingredient> findAll() {

        return this.ingredientService.findAll();
    }

    @PostMapping("/add")
    public Ingredient save(@RequestBody Ingredient ingredient) {
        return this.ingredientService.save(ingredient);
    }
}
