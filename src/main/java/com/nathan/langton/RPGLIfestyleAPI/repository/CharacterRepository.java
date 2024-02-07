package com.nathan.langton.RPGLIfestyleAPI.repository;

import com.nathan.langton.RPGLIfestyleAPI.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, String> {
}
