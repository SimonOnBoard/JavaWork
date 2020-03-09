package system;

import java.util.Locale;
import java.util.Scanner;

public class DogovorSystem {
    public static void main(String[] args) {
        Dogovor[] dogovors = new Dogovor[50];
        People[] peoples = new People[50];
        int i = 0, j = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int k;
        String command;
        while (true) {
            command = scanner.nextLine();
            switch (command) {
                case "Создать договор":
                    if (i > 49) {
                        System.out.println("Места для людей больше нет");
                        continue;
                    } else {
                        System.out.println("Введите стоимость");
                        double cost = scanner.nextDouble();
                        //ЗДЕСЬ НЕ СЛУЧАЙНО ПРОСТО ТАК ЕЩЁ РАЗ ЭТО СТРОКА, ОБЪЯСНЮ НА СЛЕДУЮЩЕМ ЗАНЯТИИ
                        scanner.nextLine();
                        System.out.println("Введите номер человек до " + (j - 1));
                        int number = scanner.nextInt();
                        if(number > j-1){
                            System.out.println("Invalid number");
                            continue;
                        }
                        //ЗДЕСЬ НЕ СЛУЧАЙНО ПРОСТО ТАК ЕЩЁ РАЗ ЭТО СТРОКА, ОБЪЯСНЮ НА СЛЕДУЮЩЕМ ЗАНЯТИИ
                        scanner.nextLine();
                        System.out.println("Введите предмет договора");
                        String subject = scanner.nextLine();
                        Dogovor dogovor = new Dogovor(cost, peoples[number], subject);
                        dogovors[i] = dogovor;
                        i++;
                    }
                    break;
                case "Создать человека":
                    if (j > 49) {
                        System.out.println("Места для людей больше нет");
                        continue;
                    } else {
                        System.out.println("Введите фио");
                        String fio = scanner.nextLine();
                        System.out.println("Введите паспорт");
                        String passport = scanner.nextLine();
                        System.out.println("Введите адрес");
                        String address = scanner.nextLine();
                        People people = new People(fio, passport, address);
                        peoples[j] = people;
                        j++;
                    }
                    break;
                case "Вывести информацию о человеке":
                    System.out.println("Введите номер человека до " + (j - 1));
                    k = scanner.nextInt();
                    if (k > j - 1) {
                        System.out.println("Неверный номер");
                        continue;
                    }
                    System.out.println(peoples[k].getInfo());
                    break;
                case "Вывести информацию о договоре":
                    System.out.println("Введите номер договора до " + (i - 1));
                    k = scanner.nextInt();
                    if (k > i - 1) {
                        System.out.println("Неверный номер");
                        continue;
                    }
                    System.out.println(dogovors[k].getInfo());
                    break;
            }
        }
    }
}
