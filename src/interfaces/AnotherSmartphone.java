package interfaces;

public class AnotherSmartphone implements SmartPhoneInterface{

    @Override
    public void takePhoto() {
        System.out.println("Я делаю фото на 1 смартфоне");
    }

    @Override
    public void makeCall() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
