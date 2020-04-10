package ru.itis.courses.schoolers.java.konkov.interfaces_03;

public class SmartPhone implements DeviceInterface, PhoneInterface, Camera {
    private int currentMileAge;

    public SmartPhone() {
        this.currentMileAge = 0;
    }

    @Override
    public void takePhoto() {
        if (currentMileAge < mileAge) {
            System.out.println("Я умею делать фото");
            currentMileAge++;
        }
    }

    @Override
    public int getCurrentMileAge() {
        return this.currentMileAge;
    }

    @Override
    public void on() {
        System.out.println("Я умею включаться");
    }

    @Override
    public void off() {
        System.out.println("Я умею выключаться");
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public void makeCall() {
        System.out.println("Я умею звонить");
    }
}
