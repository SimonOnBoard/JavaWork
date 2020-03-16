package interfaces;

public interface Phone {
    void makeCall();
    default void doSomething(){
        System.out.println("Do something");
    }
}
