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
@Entity
@Table(name = "HERO")
public class HeroEntity extends Creature{

    @Column(name = "LVL")
    private int lvl;
    @Column(name = "EP")
    private int ep;
}
