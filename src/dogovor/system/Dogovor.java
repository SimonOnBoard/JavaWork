package dogovor.system;


import java.lang.ref.Cleaner;
import java.sql.ClientInfoStatus;
import java.time.LocalDateTime;
import java.sql.Date;

public class Dogovor {
    private double cost;
    private Date date;
    private String subject;
    private String status;
    private static int count = 0;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Client getOtvetstvenniyChelovek() {
        return otvetstvenniyChelovek;
    }

    public void setOtvetstvenniyChelovek(Client otvetstvenniyChelovek) {
        this.otvetstvenniyChelovek = otvetstvenniyChelovek;
    }


    public String getSubject() {
        return subject;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }


    //Конструктор класса
    //метод вызываем для создания нового объекта
    //создаваем объект называется экземпляром класса
    public Dogovor(double cost, People otvetstvenniyChelovek, Date date, String subject, String status) {
        count++;
        this.cost = cost;
        this.otvetstvenniyChelovek = otvetstvenniyChelovek;
        this.date = date;
        this.subject = subject;
        this.status = status;
    }

    public Dogovor(double cost, People otvetstvenniyChelovek, String subject) {
        this(cost, otvetstvenniyChelovek, Date.valueOf(LocalDateTime.now().toLocalDate()), subject);
    }

    public Dogovor(double cost, People otvetstvenniyChelovek, Date date, String subject) {
        this(cost, otvetstvenniyChelovek, Date.valueOf(LocalDateTime.now().toLocalDate()), subject, "Принято в работу");
    }

    public String getInfo() {
        return "" + this.id + "" + this.cost + " " + this.otvetstvenniyChelovek.getInfo()
                + " " + this.subject + " " + this.status + " " + this.date;
    }

    public void changeSum(double cost) {
        this.cost = cost;
    }

}
