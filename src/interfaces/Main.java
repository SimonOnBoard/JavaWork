package interfaces;

public class Main {
    public static final int counter = 100;
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void makeCall() {
                System.out.println("Я звоню по только что созданному объекту");
                System.out.println(counter);
            }
            @Override
            public void doSomething(){
                System.out.println("Naive realization");
            }
        };
        phone.doSomething();
        phone.makeCall();
        Phone phone1 = new AnotherSmarphone2();
        phone.doSomething();
    }
}
