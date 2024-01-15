package com.heroes.rpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "GAME_STATE")
    private GameStateEntity gameState;
    @Column(name = "HEALTH")
    private int health;
    @Column(name = "DAMAGE")
    private int damage;
    @Column(name = "LEVEL")
    private int lvl;
    @Column(name = "EXPERIENCE_POINTS")
    private int ep;
}
