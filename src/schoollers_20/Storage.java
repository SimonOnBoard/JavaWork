package schoollers_20;

public class Storage {
    private static final int CAPACITY = 1000;

    public Storage() {
        this.dogovors = new StorageEntry[CAPACITY];
        counter = 0;
    }

    private StorageEntry[] dogovors;
    private int counter;
    public void add(Dogovor dogovor){
        if(counter < CAPACITY){
            dogovors[counter] = new StorageEntry(dogovor);
            counter++;
        }
        else{
            System.out.println("Мест нет");
        }
    }
    public Dogovor getDogovor(int position){
        if(position >= 0 && position < counter){
            return dogovors[position].getDogovor();
        }
        else {
            System.out.println("Недоступный индекс");
            return null;
        }
    }
}
