package ru.itis.courses.schoolers.java.konkov.schoollers_20;

public class Dogovor {
    public static int counter = 0;
    private String subject;
    private double cost;
    private String date;
    private String status;
    private ResponsiblePeople responsiblePeople;

    public Dogovor(String subject, double cost, String date, String status, ResponsiblePeople responsiblePeople) {
        this.subject = subject;
        this.cost = cost;
        this.date = date;
        this.status = status;
        this.responsiblePeople = responsiblePeople;
        counter++;
    }

    public String getResponsiblePeoplesInfo() {
        responsiblePeople.setPassport("Я сменил пасспорт");
        return this.responsiblePeople.getInfo();
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return this.subject + " " + this.cost + " " + this.date + " " + this.status;
    }

    public double getCost() {
        return cost;
    }

    public Dogovor(String subject, double cost, String date) {
        this(subject, cost,date,"Принято в работу");
    }

    public Dogovor(String subject, double cost, String date, ResponsiblePeople responsiblePeople) {
        this(subject, cost,date,"Принято в работу", responsiblePeople);
    }

    public Dogovor(String subject, double cost, String date, String status) {
        this.subject = subject;
        this.cost = cost;
        this.date = date;
        this.status = status;
    }
}
