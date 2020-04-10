package ru.itis.courses.schoolers.java.konkov.abstract_03;

public abstract class Device {
    private String name;
    public String getName() {
        return name;
    }
    abstract public void on();
    abstract public void off();
    abstract public String getInfo();
}
