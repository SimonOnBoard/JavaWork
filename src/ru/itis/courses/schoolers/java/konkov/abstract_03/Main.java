package ru.itis.courses.schoolers.java.konkov.abstract_03;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[10];
        for (int i = 0; i < devices.length; i += 2) {
            devices[i] = new Phone();
            devices[i+1] = new Camera();
        }
        for (Device device : devices) {
            System.out.println(device.getInfo());
        }
    }
}
