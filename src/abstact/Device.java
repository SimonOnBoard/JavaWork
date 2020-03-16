package abstact;

import interfaces.Phone;

import java.sql.Date;
import java.time.LocalDateTime;

public abstract class Device implements Phone {
    protected String name;
    protected Date date;

    public Device(String name) {
        this.name = name;
        this.date = Date.valueOf(LocalDateTime.now().toLocalDate());
    }

    @Override
    public void makeCall(){
        System.out.println("fdsjghsdjgh");
    };

    public static void printInfo(){
        System.out.println("I am printing info");
    }
}
