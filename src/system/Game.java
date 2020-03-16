package system;

import java.sql.Date;
import java.time.LocalDateTime;

public class Game {
    public StorageEntry startGame(Player player1, Player player2) {
        int counter = 0;
        while (player1.getHp() > 0 && player2.getHp() > 0) {
            if (counter % 2 == 0) {
                player1.kick(player2);
                counter++;
            }
            else{
                player2.kick(player1);
                counter++;
            }
        }
        byte result = player1.getHp() > 0 ? (byte) 1 : 2;
        StorageEntry storageEntry = new StorageEntry
                (player1.getName(),player2.getName(),result, Date.valueOf(LocalDateTime.now().toLocalDate()));
        return storageEntry;
    }
}
