package com.heroes.rpg.repository;

import com.heroes.rpg.entity.SaveGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveGameRepo extends JpaRepository<SaveGameEntity,Long> {
}
