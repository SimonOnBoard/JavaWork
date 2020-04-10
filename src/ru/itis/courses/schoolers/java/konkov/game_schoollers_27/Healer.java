package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

public class Healer extends Player {

    int healPoints;

    public Healer(String name) {
        super(name);
        this.healPoints = random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Healer{" +
                "healPoints=" + healPoints +
                ", hp=" + hp +
                ", name='" + name + '\'' +
                '}' + this.getClass();
    }

    @Override
    public void kick(Player enemy) {
        int force = random.nextInt(10);
        if (force < 8) {
            enemy.setHp(enemy.getHp() - force);
            System.out.println(this.getName() + " ударил " + enemy.getName() +  " с силой " + force);
            int rand = random.nextInt(10);
            if(rand > 8){
                int currentHeal = random.nextInt(20);
                if(healPoints >= currentHeal) {
                    this.healPoints -= currentHeal;
                    this.hp += currentHeal;
                    System.out.println(this.getName() + " вылечил себя на " + currentHeal);
                }
            }
            return;
        }
        System.out.println(this.getName() + " промахнулся " + enemy.getName());
        System.out.println("Работает код в классе наследнике Healer");
    }

    public void printHealerInfo(){
        System.out.println("я друид");
    }

}
