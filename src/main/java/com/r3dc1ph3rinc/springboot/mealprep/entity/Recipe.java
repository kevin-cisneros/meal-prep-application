package com.r3dc1ph3rinc.springboot.mealprep.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.AnyDiscriminator;

import java.util.Set;


@Entity
@Table(name = "recipes")
@Setter
@Getter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "recipe_name", nullable = false, length = 100)
    private String recipeName;

    @Min(1)
    @NotNull
    @Column(name = "prep_time_min", nullable = false)
    private Integer prepTimeMin;

    @Min(0)
    @Column(name = "cook_time_min", nullable = false)
    private Integer cookTimeMin;

    @Column(name = "serving_temp", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Temp servingTemp;

    @NotNull
    @Column(name = "gluten_free", nullable = false)
    private Boolean glutenFree;

    @Min(1)
    @NotNull
    @Column(name = "servings", nullable = false)
    private Integer servings;

    @NotBlank
    @Column(name = "instructions", nullable = false)
    private String instructions;

    @OneToMany(mappedBy = "recipe")
    private Set<RecipeIngredients> recipeIngredients;

    public Recipe() {

    }
}
