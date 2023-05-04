package com.mycoffee.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CoffeeRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

// TODO: 한 개의 레시피는 여러개의 '지침' 이 있어야 하는데, 이것을 어떻게 구현할 것인지?
}
