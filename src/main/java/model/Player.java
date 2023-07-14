package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.sql.Timestamp;

@ToString@AllArgsConstructor@Builder
public class Player {
    private Integer id;
    private Integer teamId;
    private String name;
    private String position;
    private Timestamp createdAt;

    public Integer getId() {
        return id;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }



}
