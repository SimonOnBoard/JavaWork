package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

import java.util.Random;

public class Player {
//    @Override
//    public String toString() {
//        return "Player{" +
//                "hp=" + hp +
//                ", name='" + name + '\'' +
//                ", random=" + random +
//                ", battleCry='" + battleCry + '\'' +
//                '}' + this.getClass();
//    }
    //private static final double pi = 3.14;

    private static int numberOfPlayers = 0;

    public int getNumberOfPlayers() {
        System.out.println(getHp() + ": " + getName());
        return numberOfPlayers;
    }

    protected int hp;
    protected String name;
    protected Random random;
    protected String battleCry;

    public void shoutBattleCry(){
        System.out.println(this.battleCry);
    }

    public Player(String name) {
        this(name, "Стандартный боевой клич");
    }

    public Player(String name, String battleCry) {
        this();
        this.name = name;
        this.battleCry = battleCry;
    }

    private Player() {
        numberOfPlayers++;
        this.hp = 100;
        this.random = new Random();
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void kick(Player enemy) {
        int force = random.nextInt(10);
        if (force < 8) {
            enemy.setHp(enemy.getHp() - force);
            System.out.println(this.getName() + " ударил " + enemy.getName() +  " с силой " + force);
            return;
        }
        System.out.println(this.getName() + " промахнулся " + enemy.getName());
    }


}
