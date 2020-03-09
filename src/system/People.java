package system;

public class People {
    String fio;
    String passport;
    String address;

    public People(String fio, String passport, String address) {
        this.fio = fio;
        this.passport = passport;
        this.address = address;
    }

    public String getInfo(){
        return this.fio + " " + this.passport + " " + this.address;
    }
}
