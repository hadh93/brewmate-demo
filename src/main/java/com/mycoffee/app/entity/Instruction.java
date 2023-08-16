package com.mycoffee.app.entity;

import jakarta.persistence.*;

import java.time.Duration;

@Entity
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private Duration duration;

    @ManyToOne
    @JoinColumn(name="coffee_recipe_id")
    private CoffeeRecipe coffeeRecipe;

}
