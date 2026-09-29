package com.r3dc1ph3rinc.springboot.mealprep.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "recipe_ingredients")
@Setter
@Getter
public class RecipeIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @NotBlank
    @Column(name = "name", length = 100)
    private String name;

    @NotNull
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private IngredientCategory category;

    @NotNull
    @Positive 
    @Column(name = "quantity", precision = 10, scale = 2)
    private BigDecimal quantity;

    @NotNull
    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private Unit unit;

    public RecipeIngredients() {

    }

}
