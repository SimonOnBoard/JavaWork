package ru.itis.courses.schoolers.java.konkov.interfaces_03;

public interface Camera {
    void takePhoto();
    int mileAge = 50000;
    int getCurrentMileAge();
    default void getCurrentCameraInfo(){
        System.out.println("Камера являет экземляром класса, который явно или неявно реализует интерфейса камеры");
    }
}
