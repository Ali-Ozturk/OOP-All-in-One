package Assignments.SmartFridge.items;

import java.util.Date;

public class Chicken extends Eatable {
    public static final String NAME = "Chicken";

    public Chicken(Date expDate) {
        super(NAME, 1, expDate);
    }
}
