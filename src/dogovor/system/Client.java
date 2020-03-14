package dogovor.system;

public class Client {
    private String fio;
    private String passport;
    private String address;

    public Client(String fio, String passport, String address) {
        this.fio = fio;
        this.passport = passport;
        this.address = address;
    }

    public String getInfo(){
        return fio + " " + passport + " " + address;
    }
}
