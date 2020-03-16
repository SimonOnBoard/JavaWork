package system;

import java.sql.Date;

public class StorageEntry {
    private String name1;
    private String name2;
    private byte result;
    private Date date;

    public StorageEntry(String name1, String name2, byte result, Date date) {
        this.name1 = name1;
        this.name2 = name2;
        this.result = result;
        this.date = date;
    }
}
