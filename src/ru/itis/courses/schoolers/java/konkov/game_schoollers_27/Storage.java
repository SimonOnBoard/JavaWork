package ru.itis.courses.schoolers.java.konkov.game_schoollers_27;

public class Storage {
    private static final int CAPACITY = 1000;
    private StorageEntry[] storageEntries;
    private int counter;
    public Storage() {
        counter = 0;
        this.storageEntries = new StorageEntry[CAPACITY];
    }

    public void add(StorageEntry storageEntry) {
        if(counter == CAPACITY){
            System.out.println("Хранилище переполнено");
        }else{
            storageEntries[counter] = storageEntry;
            counter++;
        }
    }

    public StorageEntry get(int i) {
        if(i - 1 >= 0 && i - 1 < CAPACITY){
            return storageEntries[i - 1];
        } else{
            return null;
        }
    }

    public void printExistingResults(){
        for (int i = 0; i < counter; i++){
            System.out.println(storageEntries[i].toString());
        }
    }
}
