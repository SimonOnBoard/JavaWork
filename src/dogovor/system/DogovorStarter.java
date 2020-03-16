package dogovor.system;

public class DogovorStarter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Dogovor physDogovor = new PhysDogovor(4254, "Предмет", new Client("Иван иванов", "3245235", "Адрес"));
        Dogovor companyContract = new CompanyContract(324234, "Предмет1", new Company("Имя","Адрес","Реквизиты","Директор"));
        storage.add(physDogovor);
        storage.add(companyContract);
        storage.printAllInfo();
    }
}
