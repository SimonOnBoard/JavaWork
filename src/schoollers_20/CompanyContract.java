package schoollers_20;

public class CompanyContract extends Dogovor {
    private Company company;

    public CompanyContract(String subject, double cost, String date, String status, ResponsiblePeople responsiblePeople,Company company) {
        super(subject, cost, status, responsiblePeople);
        this.company = company;
    }
    public String getCompanyInfo(){
        return company.toString();
    }

    @Override
    public String getInfo() {
        return "Я договор с компанией, я особенный";
    }
}
