package com.mycoffee.app.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BrewType {
    AEROPRESS("에어로프레스"),
    COLD_BREW("콜드 브루"),
    ESPRESSO("에스프레소"),
    FRENCH_PRESS("프렌치 프레스"),
    MOKA_POT("모카 포트"),
    POUR_OVER("푸어 오버"),
    SYPHON("사이폰");
    private final String description;

}
