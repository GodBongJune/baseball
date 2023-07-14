package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.sql.Timestamp;
@Builder@ToString@AllArgsConstructor
public class Stadium {
    private Integer id;
    private String name;
    private Timestamp createdAt;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
