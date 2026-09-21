package com.r3dc1ph3rinc.springboot.mealprep.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "recipes")
@Setter
@Getter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "recipe_name", nullable = false, length = 45)
    private String recipeName;

    @Column(name = "prep_time_min", nullable = false)
    private Integer prepTimeMin;

    @Column(name = "cook_time_min", nullable = false)
    private Integer cookTimeMin;

    @Column(name = "serving_temp", nullable = false)
    private String servingTemp;

    @Column(name = "gluten_free", nullable = false)
    private Boolean glutenFree;

    @Column(name = "serving_size", nullable = false)
    private Integer servingSize;

    @Column(name = "instructions", nullable = false)
    private String instructions;

    public Recipe() {

    }
}
