package dao;

import db.DBConnection;

import java.sql.Connection;

public class OutPlayerDao {
    private Connection connection;

    public OutPlayerDao(Connection connection) {
        this.connection = connection;
    }

    //C create/R read/U update/D delete
    public void insert(Integer playerId,String reason){
    String insert="";
    }
}
