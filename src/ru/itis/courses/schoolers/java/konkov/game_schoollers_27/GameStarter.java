package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

import java.util.Random;

import static java.lang.Math.cos;
import static java.lang.Math.getExponent;

public class GameStarter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println(cos(343));
        //Восходящее преобразование - сужение  интерфейса потомка до интерейа родителя
        //Возможности переменной опеределяются типом её класса(Healer или Player).
        //Объекты детей могут представляться родителями( в плане интерфейса)
        Player player = new Healer("Паша");
        //player.printHealerInfo();
        Player player1 = new SuperPlayer("Артур","Я Артур",30);
        System.out.println(player.getNumberOfPlayers());
        Game game = new Game(player1,player,"Новая игра");
        System.out.println(game.getFirstPlayerInfo());
        System.out.println(game.getSecondPlayerInfo());
        StorageEntry storageEntry = game.start();
        storage.add(storageEntry);
        //storageEntry.setWinner("Abrakadabra");
        StorageEntry storageEntry1 = storage.get(1);
        if(storageEntry1 != null){
            System.out.println(storageEntry1.toString());
        }

        bigGames(storage);

    }

    private static void bigGames(Storage storage) {
        Random random = new Random();
        Game game;
        StorageEntry storageEntry;
        for(int i = 0; i < 10; i+=2){
            int x = random.nextInt(10);
            Player player = new Healer("" + i);
            Player player1 = new SuperPlayer("" + (i + 1),"" + (i + 1),i);
            if(x > 5){
                game = new Game(player, player1,"" + i);
            }
            else{
                game = new Game(player1, player, "" + i);
            }
            storageEntry =  game.start();
            storage.add(storageEntry);
        }
        storage.printExistingResults();
    }

}
