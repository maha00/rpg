package com.heroes.rpg.repository;

import com.heroes.rpg.entity.GameStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveGameRepo extends JpaRepository<GameStateEntity,Long> {
}
