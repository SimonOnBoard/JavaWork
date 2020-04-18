package exceptions_22;

import java.util.concurrent.ExecutorService;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
