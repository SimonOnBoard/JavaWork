package system;

import java.util.Random;

public class Player {
    protected int hp;
    protected String name;
    protected String battleCry;
    protected Random random;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

        public Player(String name, String battleCry) {
            this.hp = 100;
            this.random = new Random();
            this.name = name;
            this.battleCry = battleCry;
            shoutBattleCry();
        }

        public Player(String name) {
            this(name, "Я обычный игрок");
        }

        public void kick(Player enemy) {
        int kickForce = random.nextInt(10);
        enemy.setHp(enemy.getHp() - kickForce);
        System.out.println(this.name + " ударил игрока " + enemy.getName() + " с силой:" + kickForce);
    }
    public void shoutBattleCry(){
        System.out.println(this.battleCry);
    }

    @Override
    public String toString() {
        return this.hp + " "  + this.name + " " + " " + this.battleCry;
    }
}
