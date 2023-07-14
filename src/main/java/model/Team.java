package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.sql.Timestamp;
@AllArgsConstructor@ToString@Builder
public class Team {
    private Integer id;
    private Integer stadiumId;
    private String name;
    private Timestamp createdAt;

    public Integer getId() {
        return id;
    }

    public Integer getStadiumId() {
        return stadiumId;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
