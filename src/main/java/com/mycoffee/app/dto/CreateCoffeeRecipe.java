package com.mycoffee.app.dto;

import com.mycoffee.app.entity.CoffeeRecipe;
import com.mycoffee.app.entity.Instruction;
import com.mycoffee.app.type.BrewType;
import com.mycoffee.app.type.PourOverType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

public class CreateCoffeeRecipe {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request {
        @NotNull
        @Size(min = 1, max = 50, message = "Recipe title must be in between 1 and 50.")
        private String title;

        @NotNull
        private BrewType brewType;

        private PourOverType pourOverType;

        @NotNull
        private List<Instruction> steps;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response {
        private String title;
        private BrewType brewType;
        private PourOverType pourOverType;
        private List<Instruction> steps;

        public static Response fromEntity(CoffeeRecipe coffeeRecipe){
            return Response.builder()
                    .title(coffeeRecipe.getTitle())
                    .brewType(coffeeRecipe.getBrewType())
                    .pourOverType(coffeeRecipe.getPourOverType())
                    .steps(coffeeRecipe.getSteps())
                    .build();
        }

    }
}
