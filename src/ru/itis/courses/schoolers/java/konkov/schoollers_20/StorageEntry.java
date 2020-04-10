package ru.itis.courses.schoolers.java.konkov.schoollers_20;

import java.sql.Date;
import java.time.LocalDateTime;

public class StorageEntry {
    private Date date;
    private Dogovor dogovor;

    public Date getDate() {
        return date;
    }

    public Dogovor getDogovor() {
        return dogovor;
    }

    public StorageEntry(Dogovor dogovor) {
        this.dogovor = dogovor;
        this.date = Date.valueOf(LocalDateTime.now().toLocalDate());
    }
}
