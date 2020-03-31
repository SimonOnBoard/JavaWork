package game_schoollers_27;

import java.sql.Date;
import java.time.LocalDateTime;

public class Game {
    private Player player1;
    private Player player2;
    private String name;

    public String getFirstPlayerInfo() {
        return player1.getName() + " " + player1.getHp();
    }

    public String getSecondPlayerInfo() {
        return player2.getName() + " " + player2.getHp();
    }

    public Game(Player player1, Player player2, String name) {
        this.player1 = player1;
        this.player2 = player2;
        this.name = name;
    }

    public StorageEntry start() {
        boolean first = true;
        player1.shoutBattleCry();
        player2.shoutBattleCry();
        if(player2 instanceof Healer){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        while (player1.getHp() > 0 && player2.getHp() > 0) {
            if (first) {
                player1.kick(player2);
                first = false;
            } else {
                player2.kick(player1);
                first = true;
            }
        }
        return player1.getHp() > 0 ? new StorageEntry(player1.getName(), player2.getName(), Date.valueOf(LocalDateTime.now().toLocalDate())) : new StorageEntry(player2.getName(), player1.getName(), Date.valueOf(LocalDateTime.now().toLocalDate()));
    }

}
