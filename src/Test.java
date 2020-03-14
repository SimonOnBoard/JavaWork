import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//        System.out.println(s1 == "Hello");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        String s3 = "Hello";
//        String s4 = "Hello";
//        String s5 = "Hell" + "o";
//        String s6 = s3 + s4;
//        System.out.println(s6);
//        System.out.println(s3 == "Hello");
//        System.out.println(s3 == s4);
//        System.out.println(s5 == s4);
//        int x = 2, y = 5;
//        char a = 'a', b = 'b';
//        System.out.println(x + y);
//        System.out.println(x + y + "");
//        System.out.println("" + x + y);
//        System.out.println(x - y + "");
//        System.out.println(a + b);
//        System.out.println(a + b + "");
//        System.out.println("" + a + b);
//        System.out.println(a + y);
//        System.out.println("" + a + y);
        calculate(2,4,"+");
        String[] strings = new String[10];
        strings[0] = "+";
        for(int i = 1; i < strings.length; i++){
            strings[i] = "" + i;
        }
        calculate(strings);
    }
    public static void calculate(int firstNumber, int lastNumber, String operation){
        switch (operation){
            case "+":
                System.out.println(firstNumber + lastNumber);
                break;
            default:
                System.out.println("No operation found");
        }
    }
    public static void calculate(){
        String[] strings = new String[50];
        for(int i = 0; i < 50; i++){
            strings[i] = "" + i;
        }
        System.out.println(getResultSum(strings));
        System.out.println(STRING_TO_CHECK);
    }

    public static void calculate(String[] args){
        switch (args[0]){
            case "+":
                int sum = getResultSum(args);
                System.out.println(sum);
                break;
            default:
                System.out.println("No operation found");
        }
    }
    static String STRING_TO_CHECK = "fdf";

    public static int getResultSum(String[] args) {
        int sum = 0;
        for(int i = 1;i < args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        return sum;
    }
}