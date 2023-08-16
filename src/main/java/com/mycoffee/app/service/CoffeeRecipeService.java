package com.mycoffee.app.service;

import com.mycoffee.app.repository.CoffeeRecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CoffeeRecipeService {
    private final CoffeeRecipeRepository coffeeRecipeRepository;


    public void create(){}

    public void modify(){}

    public void delete(){}
}
