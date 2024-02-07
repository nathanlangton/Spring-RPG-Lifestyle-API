package com.nathan.langton.RPGLIfestyleAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDTO {

    private String characterName;
    private Integer characterHealth;
    private Integer characterMana;

    private Integer characterLevel;
    private Integer characterCurrentXP;
    private Integer xpNeededForNextLevel;

    private Integer strengthLevel;
    private Integer AgilityLevel;
    private Integer bodyLevel;
    private Integer charismaLevel;
    private Integer intelligenceLevel;
    private Integer willpowerLevel;
}
