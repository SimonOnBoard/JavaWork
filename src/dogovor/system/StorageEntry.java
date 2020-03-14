package dogovor.system;

import java.sql.Date;

public class StorageEntry {
    Dogovor dogovor;
    Date date;

    public StorageEntry(Dogovor dogovor, Date date) {
        this.dogovor = dogovor;
        this.date = date;
    }
}
