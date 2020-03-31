package game_schoollers_27;

import java.sql.Date;

public class StorageEntry {
    private String winner;
    private String proigavshiy;
    private Date date;

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }

    public String getProigavshiy() {
        return proigavshiy;
    }


    public Date getDate() {
        return date;
    }

    public StorageEntry(String winner, String proigavshiy, Date date) {
        this.winner = winner;
        this.proigavshiy = proigavshiy;
        this.date = date;
    }
}
