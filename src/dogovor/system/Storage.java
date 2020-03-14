package dogovor.system;

public class Storage {
    private static final int CAPACITY = 1000;
    private StorageEntry[] storageEntries;
    private static int counter = 0;

    public Storage() {
        this.storageEntries = new StorageEntry[CAPACITY];
    }

    public void save(StorageEntry entry) {
        if (counter < 1000) {
            storageEntries[counter] = entry;
            counter++;
        } else {
            System.out.println("Место закончилось");
        }
    }

    public StorageEntry get(int i) {
        if ((0 <= i) && (i < 1000)) {
            return storageEntries[i];
        }
        return null;
    }
}
