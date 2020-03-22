package enum_21;

public class Main {
    public static void main(String[] args) {
        Season s1 = Season.SPRING;
        System.out.println(s1);
        for(Season s: Season.values()){
            System.out.println(s);
        }
        if(s1 == Season.SUMMER){
            System.out.println();
        }
        else {
            System.out.println("Весна это не лето");
        }
        System.out.println(Season.SUMMER.ordinal());
        Season season = Season.valueOf("WINTER");
        //Season season1 = Season.valueOf("winter");
        Color color = Color.WHITE;
        if(color == Color.WHITE){
            System.out.println("Мы используем enum для сравнения");
        }
//        if(car.getColor().equals("WHITE")){
//
//        }
        System.out.println(color.getRGBValues());

    }
}
