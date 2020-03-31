package game_schoollers_27;

import static java.lang.Math.cos;
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
            System.out.println(storageEntry1.getWinner());
        }

    }

}
