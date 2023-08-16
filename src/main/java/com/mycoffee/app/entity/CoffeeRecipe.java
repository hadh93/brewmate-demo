package com.mycoffee.app.entity;

import com.mycoffee.app.type.BrewType;
import com.mycoffee.app.type.PourOverType;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CoffeeRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private BrewType brewType;

    @Nullable
    @Enumerated(EnumType.STRING)
    private PourOverType pourOverType;

    @OneToMany(mappedBy = "coffee_recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Instruction> steps;
}
