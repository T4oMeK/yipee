package com.yipee.yipeebackend.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AnimalDto {
    int id;
    String name;
    String type;
    Integer happiness;
    Boolean isFed;
    Boolean isBrushed;
    Boolean isClean;
}
