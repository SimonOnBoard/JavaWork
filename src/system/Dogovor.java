package system;

import java.time.LocalDateTime;

public class Dogovor {
    //декларация атрибутов класса
    double cost;
    People otvetstvenniyChelovek;
    String date;
    String subject;
    String status;

    //Конструктор класса
    //метод вызываем для создания нового объекта
    //создаваем объект называется экземпляром класса
    public Dogovor(double cost, People otvetstvenniyChelovek, String date, String subject, String status) {
        this.cost = cost;
        this.otvetstvenniyChelovek = otvetstvenniyChelovek;
        this.date = date;
        this.subject = subject;
        this.status = status;
    }

    public Dogovor(double cost, People otvetstvenniyChelovek, String subject) {
        this(cost, otvetstvenniyChelovek, LocalDateTime.now().toString(), subject, "Принято в работу");
    }

    public String getInfo(){
        return "" + this.cost + " " + this.otvetstvenniyChelovek.getInfo() + " " + this.subject + " " + this.status + " " + this.date;
    }
}
