package dogovor.system;


import java.lang.ref.Cleaner;
import java.sql.ClientInfoStatus;
import java.time.LocalDateTime;
import java.sql.Date;

public class Dogovor {
    private double cost;
    private Date date;
    private String subject;
    private String status;
    private static int count = 0;

    public Dogovor(double cost, String subject) {
       this(cost, Date.valueOf(LocalDateTime.now().toLocalDate()),subject,"Принято в работу");
    }

    public void getInfo(){
        System.out.println("Я вывожу информацию о объекте родителе");
    }

    public Dogovor(double cost, Date date, String subject, String status) {
        this.cost = cost;
        this.date = date;
        this.subject = subject;
        this.status = status;
    }
}
