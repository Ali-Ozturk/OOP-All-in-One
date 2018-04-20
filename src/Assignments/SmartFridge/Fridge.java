package Assignments.SmartFridge;

public class Fridge {
    public boolean isOpen = false;
    public double temperature;
    public int maxAmount;

    public Fridge() {
        this.temperature = 5;
        this.maxAmount = 100;
    }

    public void isStocked(int amount){
        if (amount < maxAmount) {
            int spaceLeft = maxAmount - amount;
            System.out.println("Fridge has " + spaceLeft + " slots more of space.");
        }
    }
}
