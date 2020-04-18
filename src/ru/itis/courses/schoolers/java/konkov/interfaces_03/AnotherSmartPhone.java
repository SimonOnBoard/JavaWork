package ru.itis.courses.schoolers.java.konkov.interfaces_03;

public class AnotherSmartPhone implements SmartPhoneInterface {

    @Override
    public void takePhoto() {

    }

    @Override
    public int getCurrentMileAge() {
        return 0;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void makeCall() {
        System.out.println("Я другой смартфон я звоню по своему");
    }
}
