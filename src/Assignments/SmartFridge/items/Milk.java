package Assignments.SmartFridge.items;

import java.util.Date;

public class Milk extends Drinkable {
    public static final String NAME = "Milk";

    public Milk(Date expDate) {
        super(NAME, 1, expDate);
    }
}