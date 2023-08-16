package com.mycoffee.app.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PourOverType {
    CHEMEX("케멕스"),
    HARIO_V60("하리오 V60"),
    KALITA_102("칼리타 102"),
    KALITA_WAVE("칼리타 웨이브"),
    KONO("고노"),
    MELITTA("멜리타"),
    MR_CLEVER("미스터 클레버"),
    ORIGAMI("오리가미");
    private final String description;
}
