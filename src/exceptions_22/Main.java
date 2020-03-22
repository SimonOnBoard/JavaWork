package exceptions_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = -5;
        Factorial factorial = new Factorial();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("1.txt"));
            System.out.println(factorial.fact(scanner.nextInt()));
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Я выполняюсь всегда");
        }
    }
}
