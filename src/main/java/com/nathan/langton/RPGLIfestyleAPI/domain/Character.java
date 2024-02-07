package com.nathan.langton.RPGLIfestyleAPI.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_character")

public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;

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
