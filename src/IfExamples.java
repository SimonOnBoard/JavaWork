import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IfExamples {
    public static void main(String[] args) {
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        double a, b;
//        char c;
//
//        while (true) {
//
//            a = scanner.nextDouble();
//            b = scanner.nextDouble();
//            c = scanner.next().charAt(0);
//            if (c == '+') {
//                System.out.println(a + b);
//            } else if (c == '-') {
//                System.out.println(a - b);
//            } else if (c == '*') {
//                System.out.println(a * b);
//            } else if (c == '/') {
//                System.out.println(a / b);
//            } else {
//                System.out.println("Ненайдена искомая операция");
//            }
//        }

        int a = 10;
        int b = 40;
        int c = 30;
        if (a < b) {
            if (a > c) {
                System.out.println("Hello");
            } else {
                System.out.println("No");
            }
        }
        if (a < b) System.out.println("a");
        a = -a;
        int n = 5;
        Random random = new Random();
        char[] charArray = getRandomCharArray(n, random);
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
    }

    public static char[] getRandomCharArray(int n, Random random) {
        char[] help = new char[n];
        for (int i = 0; i < n; i++) {
            help[i] = (char) random.nextInt();
        }
        return help;
    }
}
