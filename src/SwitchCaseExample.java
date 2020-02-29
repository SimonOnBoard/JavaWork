import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char c;
        while (true) {
            System.out.println("Введите первое число");
            a = scanner.nextDouble();
            System.out.println("Введите второе число");
            b = scanner.nextDouble();
            System.out.println("Введите операцию");
            c = scanner.next().charAt(0);
            double result = (c == '*') ? a * b : (c == '+') ? a + b :
                    (c == '/') ? a / b : (c == '-') ? a - b : -1d;
            System.out.println(result);
            switch (c) {
                case '*':
                    System.out.println(a * b);
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Операция не найдена");
                    break;
            }
            if (c == 'a') {
                break;
            }
        }
    }
}
