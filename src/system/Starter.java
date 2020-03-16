package system;

import java.awt.*;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        String name1 = scanner.nextLine();
        System.out.println("Введите клич");
        String battlecry = scanner.nextLine();
        Player player = new Player(name1, battlecry);
        System.out.println("Введите имя второго игрока");
        String name2 = scanner.nextLine();

        //Player player1 = new HealerPlayer(name2);
        HealerPlayer player1 = new HealerPlayer(name2);
        Storage storage = new Storage();
        Game game = new Game();
        System.out.println(player1.toString());
        System.out.println(player);
        StorageEntry storageEntry = game.startGame(player, player1);
        storage.save(storageEntry);
        int i = 0;
    }
}
