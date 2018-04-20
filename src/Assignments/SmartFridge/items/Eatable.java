package Assignments.SmartFridge.items;

import java.util.Date;

public class Eatable implements Item {
    private String name;
    private int size; // Plads
    private Date expDate;

    public Eatable(String name, int size, Date expDate) {
        this.name = name;
        this.size = size;
        this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Date getExpDate() {
        return expDate;
    }

    public boolean isExpired(Date thisDate){
        return thisDate.after(expDate);
    }
}
