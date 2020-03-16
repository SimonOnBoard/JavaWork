package dogovor.system;

public class CompanyContract extends Dogovor {
    private Company company;
    public CompanyContract(double cost, String subject, Company company) {
        super(cost, subject);
        this.company = company;
    }
    @Override
    public void getInfo() {
        System.out.println("Я вывожу информацию об объекте договора копании");
    }
}
