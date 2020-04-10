package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

public class SuperPlayer extends Player {
    private int superUdar;
    public SuperPlayer(String name, String battleCry,int superUdar) {
        super(name, battleCry);
        this.superUdar = superUdar;
        this.hp += 20;
    }

    public int getSuperUdar() {
        return superUdar;
    }

    public void scareEnemy(){
        System.out.println("I am so disgusting");
    }

//    @Override
//    public String toString() {
//        return "SuperPlayer{" +
//                "superUdar=" + superUdar +
//                ", hp=" + hp +
//                ", name='" + name + '\'' +
//                '}' + this.getClass() + "Axax я всегда побеждаю";
//    }

    @Override
    public void kick(Player enemy) {
        int force = random.nextInt(10);
        if (force < 8) {
            int a = random.nextInt(2);
            if(a == 1){
                System.out.println("Игрок " + this.getName() + " наносит суперудар " + this.getSuperUdar() + " игроку " + enemy.getName());
                enemy.setHp(enemy.getHp()  - superUdar);
            }
            enemy.setHp(enemy.getHp() - force);
            System.out.println(this.getName() + " ударил " + enemy.getName() +  " с силой " + force);
            return;
        }
        System.out.println(this.getName() + " промахнулся " + enemy.getName());
    }
}
