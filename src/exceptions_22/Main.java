package exceptions_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int a = -5;
        Factorial factorial = new Factorial();
        Scanner scanner = null;
        scanner = new Scanner(new File("1.txt"));
        try {
            System.out.println(factorial.factorial(scanner.nextInt()));
        }  catch (MyException e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("Я выполняюсь всегда");
        }

    }
}
