package dogovor.system;

public class Company {
    private String name;
    private String adress;
    private String recvizity;
    private String director;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", recvizity='" + recvizity + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public Company(String name, String adress, String recvizity, String director) {
        this.name = name;
        this.adress = adress;
        this.recvizity = recvizity;
        this.director = director;
    }


}
