package ru.itis.courses.schoolers.java.konkov.abstract_03;

public class Camera extends Device{

        public void on() {
            System.out.println("Я камера и я включаюсь по своему");
        }
        public void off() {
            System.out.println("Я камера и я выключаюсь по своему");
        }
        public String getInfo() {
            return "Можно снимать фотографии просматривать их";
        }

        public void makePhoto() {
            System.out.println("Я камера и я делаю фото");
        }
}
