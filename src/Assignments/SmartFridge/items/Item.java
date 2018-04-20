package Assignments.SmartFridge.items;

import java.util.Date;

public interface Item {

    // Metoder
    /* isExpired
       isDrinkable
       isEatable */

    /** Check if an item has expired.
     * @return Returns true if has expired and false if not. */
    public boolean isExpired(Date thisDate);

}
