package com.nathan.langton.RPGLIfestyleAPI.model.mappers;

import com.nathan.langton.RPGLIfestyleAPI.domain.Character;
import com.nathan.langton.RPGLIfestyleAPI.model.CharacterDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = Character.class)
public interface CharacterMapper{

    Character toEntity(CharacterDTO dto);
    CharacterDTO toDto(Character entity);
}
