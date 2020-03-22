package schoollers_20;

public class DogovorStarter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        ResponsiblePeople responsiblePeople = new ResponsiblePeople("Иванов Иван Иванович",
                "ул Кремлевская д35","5324 432548");
        Dogovor dogovor = new Dogovor("Договор про мебель", 15555.0, "12.04.2019", responsiblePeople);
        Dogovor dogovor1 = new Dogovor("Договор не на мебель а на компьютеры",544.54,"63.14.-2", responsiblePeople);
        storage.add(dogovor);
        storage.add(dogovor1);

        System.out.println(storage.getDogovor(0).getInfo());
        System.out.println(storage.getDogovor(1).getInfo());
        System.out.println(storage.getDogovor(0).getResponsiblePeoplesInfo());
        System.out.println(storage.getDogovor(1).getResponsiblePeoplesInfo());
        Dogovor dogovor3 = storage.getDogovor(1);
        dogovor3.setCost(dogovor3.getCost() + 2000);
        System.out.println(dogovor1 == dogovor3);
        System.out.println(dogovor1.getInfo());
        System.out.println(dogovor.counter);
        System.out.println(dogovor1.counter);
    }
}
