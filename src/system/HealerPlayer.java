package system;

import java.util.Random;

public class HealerPlayer extends Player{
    private int healPoints;

    public HealerPlayer(String name, String battleCry) {
        super(name,battleCry);
        this.healPoints = 20;
        this.battleCry += "  Я умею лечить";
    }

    public HealerPlayer(String name) {
        this(name, "я необычный игрок");
    }

    public void heal(){
        int currentHeal = random.nextInt(30);
        if(currentHeal < healPoints){
            this.setHp(this.getHp() + currentHeal);
            healPoints -= currentHeal;
        }
    }
    @Override
    public void kick(Player enemy){
        int kickForce = random.nextInt(10);
        enemy.setHp(enemy.getHp() - kickForce);
        System.out.println(this.name + " ударил игрока " + enemy.getName() + " с силой:" + kickForce);
        int random1 = random.nextInt(2);
        if(random1 % 2 == 0){
            heal();
        }
    }

    @Override
    public String toString() {
        return this.hp + " "  + this.name + " " + this.healPoints + " " + this.battleCry;
    }
}
