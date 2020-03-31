package schoollers_20;

public class Company {
    private String name;
    private String INN;
    private String director;
    private String address;

    public Company(String name, String INN, String director, String address) {
        this.name = name;
        this.INN = INN;
        this.director = director;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", INN='" + INN + '\'' +
                ", director='" + director + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
