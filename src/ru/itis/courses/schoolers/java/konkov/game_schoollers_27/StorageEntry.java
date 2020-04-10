package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

import java.sql.Date;
import java.util.Arrays;

public class StorageEntry {
    private Player[] players;
    private Date date;

    public StorageEntry(Player[] players, Date date) {
        this.players = players;
        this.date = date;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String result = "";
        for(Player player: players){
            result += " ";
            result += player.toString();
        }
        return result;
    }
}
