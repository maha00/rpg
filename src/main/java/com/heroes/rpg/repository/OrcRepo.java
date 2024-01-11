package com.heroes.rpg.repository;

import com.heroes.rpg.entity.OrcEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcRepo extends JpaRepository<OrcEntity,Long> {
}
