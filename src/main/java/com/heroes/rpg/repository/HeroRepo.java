package com.heroes.rpg.repository;

import com.heroes.rpg.entity.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepo extends JpaRepository<HeroEntity,Long> {
}
