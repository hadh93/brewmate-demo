package com.mycoffee.app.repository;

import com.mycoffee.app.entity.CoffeeRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRecipeRepository extends JpaRepository<CoffeeRecipe, Long> {
}
