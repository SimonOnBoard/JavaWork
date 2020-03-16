package dogovor.system;

public class PhysDogovor extends Dogovor {
    private Client client;
    public PhysDogovor(double cost, String subject, Client client) {
        super(cost, subject);
        this.client = client;
    }

    @Override
    public void getInfo() {
        System.out.println("Я вывожу информацию об объекте физического договора");
    }
}
