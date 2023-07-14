package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.sql.Timestamp;

@ToString@AllArgsConstructor@Builder
public class OutPlayer {
    private Integer id;
    private Integer playerId;
    private String reason;
    private Timestamp createdAt;

    public Integer getId() {
        return id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public String getReason() {
        return reason;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
