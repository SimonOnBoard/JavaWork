package ru.itis.courses.schoolers.java.konkov.interfaces_03;

import schoollers_20.Dogovor;

public class Main {
    public static void main(String[] args) {
        // TODO: 10.04.2020  Сделать так. чтобы смартфон представлялся телефоном, использоваться методы телефона
        Camera camera = new SmartPhone();
        camera.takePhoto();
        // TODO: 10.04.2020  Реализация своего анонимного класса, реализуйте интерфейс девайса( можно наивную реализацию)
        Camera camera1 = new Camera() {
            private int currentMileAge = 0;
            @Override
            public void takePhoto() {
                if(currentMileAge < mileAge) {
                    System.out.println("Я делаю фотографию");
                    System.out.println("Я особая камера которую я создал только что");
                }else{
                    System.out.println("Камера больше не делает снимки");
                    System.out.println("Замените матрицу");

                }
            }

            @Override
            public int getCurrentMileAge() {
                return 30;
            }
        };
        camera1.takePhoto();

        Camera camera3 = new AnotherSmartPhone();
        camera3.takePhoto();
        // TODO: 10.04.2020  Создайте телефон, сделайте метод который принимает девайс, преобразуйте телефон в девайс)))

        callWithPhone((PhoneInterface) camera3);
   }
    public static void callWithPhone(PhoneInterface phone){
        phone.makeCall();
    }
}
