package schoollers_20;

public class ResponsiblePeople {
    private String FIO;
    private String address;
    private String passport;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public ResponsiblePeople(String FIO, String address, String passport) {
        this.FIO = FIO;
        this.address = address;
        this.passport = passport;
    }

    public String getInfo(){
        return this.FIO + " " + this.address + " " + this.passport;
    }
}
