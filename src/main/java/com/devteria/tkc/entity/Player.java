package com.devteria.tkc.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    // Getters and Setters
}

