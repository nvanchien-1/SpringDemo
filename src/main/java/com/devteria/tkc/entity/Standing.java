package com.devteria.tkc.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "standings")
public class Standing {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private int points;
    private int wins;
    private int draws;
    private int losses;

    // Getters and Setters
}
