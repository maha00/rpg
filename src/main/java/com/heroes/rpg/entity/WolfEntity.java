package com.heroes.rpg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MMA_WOLF")
public class WolfEntity extends Enemy {
    private static final String NAME = "Fluffy";
    private static final int MAX_HEALTH = 40;

    public WolfEntity() {
        super();
        this.setName(NAME);
        this.setHealth(MAX_HEALTH);
    }
}
