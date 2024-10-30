package com.devteria.tkc.dto.request;

import java.time.LocalDate;
import java.util.List;


public class UserCreationRequest {
    private String username;
    private String password;
    private String fname; // Tên đầy đủ
    private LocalDate dob; // Ngày sinh
    private TeamDetails teamDetails; // Chi tiết đội bóng

    // Constructor
    public UserCreationRequest() {}

    public UserCreationRequest(String username, String password, String fname, LocalDate dob, TeamDetails teamDetails) {
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.dob = dob;
        this.teamDetails = teamDetails;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public TeamDetails getTeamDetails() {
        return teamDetails;
    }

    public void setTeamDetails(TeamDetails teamDetails) {
        this.teamDetails = teamDetails;
    }

    // Inner class to represent team details
    public static class TeamDetails {
        private String teamName;
        private List<PlayerRequest> players; // Danh sách cầu thủ

        // Constructor
        public TeamDetails() {}

        public TeamDetails(String teamName, List<PlayerRequest> players) {
            this.teamName = teamName;
            this.players = players;
        }

        // Getters and Setters
        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public List<PlayerRequest> getPlayers() {
            return players;
        }

        public void setPlayers(List<PlayerRequest> players) {
            this.players = players;
        }
    }

    // Inner class to represent player request details
    public static class PlayerRequest {
        private String playerName; // Tên cầu thủ
        private String position; // Vị trí của cầu thủ

        // Constructor
        public PlayerRequest() {}

        public PlayerRequest(String playerName, String position) {
            this.playerName = playerName;
            this.position = position;
        }

        // Getters and Setters
        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }
}
