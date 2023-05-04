package com.mycoffee.app;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PourOverType {
    CHEMEX("케멕스"),
    HARIO_V60("하리오 V60"),
    KALITA_120("칼리타 102"),
    KALITA_WAVE("칼리타 웨이브"),
    KONO("고노"),
    MELITTA("멜리타"),
    MR_CLEVER("클레버"),
    ORIGAMI("오리가미");
}

//TODO: Map this to BrewType