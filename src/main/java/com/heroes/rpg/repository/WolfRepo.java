package com.heroes.rpg.repository;

import com.heroes.rpg.entity.WolfEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WolfRepo extends JpaRepository<WolfEntity,Long> {
}
