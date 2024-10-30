package com.devteria.tkc.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "match_results")
public class MatchResult {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    private int homeTeamScore;

    private int awayTeamScore;

    // Getters and Setters
}

