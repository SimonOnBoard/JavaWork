package ru.itis.courses.schoolers.java.konkov.abstract_03;

public class Phone extends Device   {
    public void on() {
        System.out.println("Я включаюсь");
    }
    public void off() {
        System.out.println("Я выключаюсь");
    }
    public String getInfo() {
        return "Можно звонить, хранить номера, принимать звонки";
    }
    public void makeCall() {
        System.out.println("Я звоню");
    }
}
