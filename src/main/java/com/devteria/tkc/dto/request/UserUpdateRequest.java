package com.devteria.tkc.dto.request;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    private String password;
    private String fname; // Tên đầy đủ
    private LocalDate dob; // Ngày sinh
    private UserCreationRequest.TeamDetails teamDetails; // Chi tiết đội bóng

    // Constructor
    public UserUpdateRequest() {}

    public UserUpdateRequest(String username, String password, String fname, LocalDate dob, UserCreationRequest.TeamDetails teamDetails) {

        this.password = password;
        this.fname = fname;
        this.dob = dob;
        this.teamDetails = teamDetails;
    }

    // Getters and Setters

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

    public UserCreationRequest.TeamDetails getTeamDetails() {
        return teamDetails;
    }

    public void setTeamDetails(UserCreationRequest.TeamDetails teamDetails) {
        this.teamDetails = teamDetails;
    }

    // Inner class to represent team details
    public static class TeamDetails {
        private String teamName;
        private List<UserCreationRequest.PlayerRequest> players; // Danh sách cầu thủ

        // Constructor
        public TeamDetails() {}

        public TeamDetails(String teamName, List<UserCreationRequest.PlayerRequest> players) {
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

        public List<UserCreationRequest.PlayerRequest> getPlayers() {
            return players;
        }

        public void setPlayers(List<UserCreationRequest.PlayerRequest> players) {
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

